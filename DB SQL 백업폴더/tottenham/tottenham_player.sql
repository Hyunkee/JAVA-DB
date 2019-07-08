CREATE DATABASE  IF NOT EXISTS `tottenham` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `tottenham`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: tottenham
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `player` (
  `player_num` int(11) NOT NULL,
  `player_team_num` int(11) DEFAULT NULL,
  `player_name` varchar(45) DEFAULT NULL,
  `player_age` varchar(45) DEFAULT NULL,
  `player_position` varchar(45) DEFAULT NULL,
  `player_weight` varchar(45) DEFAULT NULL,
  `player_height` varchar(45) DEFAULT NULL,
  `player_goals` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`player_num`),
  KEY `player_team_num_idx` (`player_team_num`),
  CONSTRAINT `player_team_num` FOREIGN KEY (`player_team_num`) REFERENCES `team` (`team_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES (1,1,'Hugo Lloris','34','Goalkeeper','188cm','82kg','1'),(2,1,'Kieran Trippier','30','Right Back','178cm','71.5kg','1'),(3,1,'Danny Rose','30','Left Back','174cm','76kg','2'),(4,1,'Toby Alderweireld','31','Center Back','187cm','90.5kg','4'),(5,1,'Jan Vertonghen','33','Center Back','189cm','87.5kg','4'),(6,1,'Davinson Sanchez','24','Center Back','187cm','81kg','2'),(7,1,'Heung-Min Son','28','Left Wing','183cm','77kg','3'),(8,1,'Harry Winks',NULL,NULL,NULL,NULL,'1'),(9,1,'Vincent Janssen',NULL,NULL,NULL,NULL,'2'),(10,1,'Harry Kane',NULL,NULL,NULL,NULL,'1'),(11,1,'Erik Lamela',NULL,NULL,NULL,NULL,NULL),(12,1,'Victor Wanyama',NULL,NULL,NULL,NULL,NULL),(13,1,'Michel Vorm',NULL,NULL,NULL,NULL,NULL),(14,1,'Georges-Kevin Nkoudou',NULL,NULL,NULL,NULL,'1'),(15,1,'Eric Dier',NULL,NULL,NULL,NULL,NULL),(16,1,'Kyle Walker-peters',NULL,NULL,NULL,NULL,NULL),(17,1,'Moussa Sissoko',NULL,NULL,NULL,NULL,'1'),(18,1,'Fernando Llorente',NULL,NULL,NULL,NULL,'1'),(20,1,'Dele Alli',NULL,NULL,NULL,NULL,'1'),(21,1,'Juan Foyth',NULL,NULL,NULL,NULL,'1'),(22,1,'Paulo Gazzaniga',NULL,NULL,NULL,NULL,NULL),(23,1,'Christian Eriksen',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:39
