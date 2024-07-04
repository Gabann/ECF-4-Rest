package com.example.ecf4rest.util;

import io.github.cdimascio.dotenv.Dotenv;

public class Environment
{
	private static final Dotenv dotenv = Dotenv.load();
	
	public static String getEnv(String key)
	{
		return dotenv.get(key);
	}
}
