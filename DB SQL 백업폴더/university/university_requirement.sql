CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: university
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
-- Table structure for table `requirement`
--

DROP TABLE IF EXISTS `requirement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `requirement` (
  `requirement_num` int(11) NOT NULL AUTO_INCREMENT,
  `requirement_entrance_year` int(11) DEFAULT NULL,
  `requirement_major` varchar(45) NOT NULL DEFAULT '',
  `requirement_degree` varchar(45) NOT NULL DEFAULT '',
  `requirement_total` int(11) DEFAULT NULL,
  `requirement_major_point` int(11) DEFAULT NULL,
  `requirement_general_point` int(11) DEFAULT NULL,
  `requirement_english` int(11) DEFAULT NULL,
  `requirement_project` varchar(45) NOT NULL DEFAULT '',
  `requirement_paper` varchar(45) NOT NULL DEFAULT '',
  `requirement_test` varchar(45) NOT NULL DEFAULT '',
  `requirement_certificate` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`requirement_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requirement`
--

LOCK TABLES `requirement` WRITE;
/*!40000 ALTER TABLE `requirement` DISABLE KEYS */;
INSERT INTO `requirement` VALUES (1,2020,'사회','4',300,40,20,70,'Y','Y','Y','Y'),(2,2021,'경영','3',250,35,15,65,'70','65','Y','2'),(3,2022,'컴퓨터','3',270,38,18,67,'73','68','72','3');
/*!40000 ALTER TABLE `requirement` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:36
