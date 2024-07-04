<!--suppress ALL, HtmlUnknownAnchorTarget -->

<a id="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

<h3 align="center">ECF-4-Rest</h3>


<div align="center">
  <p>
    A rest application for employees management
    <br />
    <a href="https://github.com/Gabann/ECF-4-Rest/tree/main/documentation"><strong>Explore the docs »</strong></a>
    <br />
    <a href="https://github.com/gabann/ECF-4-Rest/issues">Report Bug</a>
    ·
    <a href="https://github.com/gabann/ECF-4-Rest/issues">Request Feature</a>
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#preview">Preview</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About the Project

This app has been built in half a day as part of an exam for my study at [M2I](https://www.m2iformation.fr/).

The goal was to create a rest application for employees management using Java, JEE, Jax-RS and MySQL.

### Features

- Create, read, update and delete endpoints for employees.
- Create, read, update and delete endpoints for departments.
- Create, read, update and delete endpoints for positions.
- Searching employees by their properties (first name, last name, department...).

### Built With

Tech stack:
[![Java][JavaBadge]][JavaUrl]
[![Maven][MavenBadge]][MavenUrl]
[![MySQL][MySQLBadge]][MySQLUrl]
![Dotenv][DotenvBadge]
[![Hibernate][HibernateBadge]][HibernateUrl]
[![Jax-RS][JaxRsBadge]][JaxRsUrl]
[![JEE][JEEBadge]][JEEUrl]

Code quality:
[![SonarLint][SonarLintBadge]][SonarLintUrl]

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- GETTING STARTED -->

## Getting Started

### Prerequisites

- [JDK](https://www.oracle.com/java/technologies/downloads/) >= 17
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/)
- [Tomcat](https://tomcat.apache.org/) >= 10.0

### Installation

```
# Clone the project:
git clone https://github.com/Gabann/ECF-4-Rest.git
cd .\ECF-4-Rest
```

Rename the `src/main/resources/.env.example` file to `.env` and fill in the database connection information.


<div align="right"><a href="#readme-top">back to top</a></div>


<!-- USAGE EXAMPLES -->

## Usage

Run the application with your tomcat configuration using the war-exploded artifact.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- ROADMAP -->

## Roadmap

[//]: # (- [ ] Feature)

[//]: # (    - [ ] Nested Feature)

- [ ] Full test code coverage

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- CONTRIBUTING -->

## Contributing

We welcome contributions from everyone! Follow these steps to contribute:

1. **Fork** the repository.
2. **Clone** the forked repository to your local machine.
3. **Create a new branch** for your contribution.
4. **Make your changes** and **commit** them.
5. **Push** your changes to your forked repository.
6. **Open a pull request** to the main project repository.

### Contribution Guidelines

- Discuss significant changes by opening an issue first.
- Follow the existing code style and structure.
- Write clear commit messages and document your code.
- Ensure changes don't break existing functionality.
- Update documentation if necessary.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- LICENSE -->

## License

Distributed under the 'LICENSE' License. See [`LICENSE`](https://github.com/Gabann/ECF-4-Rest/blob/main/LICENSE) for more information.

<div align="right"><a href="#readme-top">back to top</a></div>


<!-- CONTACT -->

## Contact

- [![Twitter][gmail-shield]][gmail-url]
- [![LinkedIn][linkedin-shield]][linkedin-url]

<div align="right"><a href="#readme-top">back to top</a></div>


---------------------------------------------------------------

[repo-link]: https://github.com/Gabann/ECF-4-Rest

[contributors-shield]: https://img.shields.io/github/contributors/gabann/ECF-4-Rest.svg?style=for-the-badge

[contributors-url]: https://github.com/gabann/ECF-4-Rest/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/gabann/ECF-4-Rest.svg?style=for-the-badge

[forks-url]: https://github.com/gabann/ECF-4-Rest/network/members

[stars-shield]: https://img.shields.io/github/stars/gabann/ECF-4-Rest.svg?style=for-the-badge

[stars-url]: https://github.com/gabann/ECF-4-Rest/stargazers

[issues-shield]: https://img.shields.io/github/issues/gabann/ECF-4-Rest.svg?style=for-the-badge

[issues-url]: https://github.com/gabann/ECF-4-Rest/issues

[license-shield]: https://img.shields.io/github/license/gabann/ECF-4-Rest.svg?style=for-the-badge

[license-url]: https://github.com/gabann/ECF-4-Rest/blob/master/LICENSE

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/gabin-deboulogne/

[gmail-shield]: https://img.shields.io/badge/Gmail-EA4335.svg?style=for-the-badge&logo=Gmail&logoColor=white

[gmail-url]: mailto:gabin.deboulogne@gmail.com

[JavaBadge]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white

[JavaUrl]: https://www.java.com/

[MavenBadge]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white

[MavenUrl]: https://maven.apache.org/

[MySQLBadge]: https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white

[MySQLUrl]: https://www.mysql.com/

[HibernateBadge]: https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white

[HibernateUrl]: https://hibernate.org/

[JaxRsBadge]: https://img.shields.io/badge/JAX--RS-EB0000?style=for-the-badge&logo=eclipse&logoColor=white

[JaxRsUrl]: https://projects.eclipse.org/projects/ee4j.jaxrs

[SonarLintBadge]: https://img.shields.io/badge/SonarLint-CB2029?logo=sonarlint&logoColor=white&style=for-the-badge

[SonarLintUrl]: https://www.sonarlint.org/

[DotenvBadge]: https://img.shields.io/badge/Dotenv-000000?style=for-the-badge&logo=dotenv&logoColor=white

[JEEBadge]: https://img.shields.io/badge/JEE-007396?style=for-the-badge&logo=javaee&logoColor=white

[JEEUrl]: https://www.oracle.com/java/technologies/java-ee-glance.html
