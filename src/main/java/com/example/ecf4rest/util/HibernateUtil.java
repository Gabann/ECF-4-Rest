package com.example.ecf4rest.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil
{
	private static SessionFactory sessionFactory;

	private HibernateUtil()
	{
	}

	public static void close()
	{
		getSessionFactory().close();
	}

	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory == null)
		{
			try
			{
				sessionFactory = buildSessionFactory();
			} catch (RuntimeException e)
			{
				throw new ExceptionInInitializerError(e);
			}
		}
		return sessionFactory;
	}

	private static SessionFactory buildSessionFactory()
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.connection.url", Environment.getEnv("DATABASE_URL"));
			configuration.setProperty("hibernate.connection.username", Environment.getEnv("DATABASE_USERNAME"));
			configuration.setProperty("hibernate.connection.password", Environment.getEnv("DATABASE_PASSWORD"));
			return configuration.configure().buildSessionFactory();
		} catch (Exception e)
		{
			throw new ExceptionInInitializerError(e);
		}
	}
}
