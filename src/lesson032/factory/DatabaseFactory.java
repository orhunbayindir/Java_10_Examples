package com.bilgeadam.lesson032.factory;

public class DatabaseFactory {

	public static ILogger createDatabase(String dbName) {

		switch (dbName) {
		case "postgre":
			return new PostgreSql();

		case "mongo":
			return new MongoDb();

		default:
			throw new RuntimeException(" Girdiğiniz databse desteklenmemektedir");
		}

	}

}
