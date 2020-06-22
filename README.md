# Spring Boot - Accessing and Adding Data

## Dependencies
- spring web
- spring data jpa
- H2 database
- Spring boot dev tools
= thymeleaf

### Dependencies
Had to update my java version in pom.xml to 1.11 to make my local JDK 

### App Properties
Added a few lines to be able to access our H2 database through console and to be able to load a external SQL source


### JPA
JPA - java persistance API
Collection of methods and classes for storing data in a database
Where does it come from?

- Dependency: Spring Data IPA

#### Annotations
* @Entity - designates a POJO class as an entity so that we can use it with JPA
* @Id - JPA will recognize this as the object's primary key
* @GeneratedValue - allows the database to set the value for the field
* @Column - attribute is stored in a database column by the same name
* @CreationTimestamp - sets the value of the field to the current time and date during creation (exactly once)


### Thymeleaf
Thymeleaf a server-side java templating engine for both web and standalone JAR apps.
Thymeleaf sits on top of exiting HTML, so we write HTML like normal and just add a few things to make it a Thymeleaf template.

#### Thymeleaf "Dialects" Basics
${...} : Variable expressions.
*{...} : Selection expressions.
#{...} : Message (i18n) expressions.
@{...} : Link (URL) expressions.
~{...} : Fragment expressions.

### Repository
A repository is necessary in Spring applications.  It aids us in adding data to our database.  It exnteds the built in CrudRepository 