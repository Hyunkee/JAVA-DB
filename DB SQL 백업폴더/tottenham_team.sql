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
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `team` (
  `team_num` int(11) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(45) DEFAULT NULL,
  `team_stadium_num` int(11) DEFAULT NULL,
  `team_manager_num` int(11) DEFAULT NULL,
  `team_staff_num` int(11) DEFAULT NULL,
  `team_hometown` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`team_num`),
  KEY `team_stadium_num_idx` (`team_stadium_num`),
  KEY `team_manager_num_idx` (`team_manager_num`),
  KEY `team_staff_num_idx` (`team_staff_num`),
  CONSTRAINT `team_manager_num` FOREIGN KEY (`team_manager_num`) REFERENCES `manager` (`manager_num`),
  CONSTRAINT `team_stadium_num` FOREIGN KEY (`team_stadium_num`) REFERENCES `stadium` (`stadium_num`),
  CONSTRAINT `team_staff_num` FOREIGN KEY (`team_staff_num`) REFERENCES `staff` (`staff_num`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Tottenham Hotspur',1,1,1,'England London South Tottenham'),(2,'Liverpool FC',2,2,2,'England Mergeside Liverpool'),(3,'Manchester City',3,1,1,'England Grate Manchester'),(4,'Chelsea',4,1,2,'England London'),(5,'Arsenal',5,2,1,'England London'),(6,'Manchester Utd',6,2,1,'England Grate Manchester');
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-03 17:10:42
