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
-- Table structure for table `match`
--

DROP TABLE IF EXISTS `match`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `match` (
  `match_num` int(11) NOT NULL AUTO_INCREMENT,
  `match_home_team_num` int(11) DEFAULT NULL,
  `match_away_team_num` int(11) DEFAULT NULL,
  `match_type` varchar(45) DEFAULT NULL,
  `match_day` varchar(45) DEFAULT NULL,
  `match_time` varchar(45) DEFAULT NULL,
  `match_home_score` int(11) DEFAULT NULL,
  `match_away_score` int(11) DEFAULT NULL,
  `match_result` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`match_num`),
  KEY `match_home_team_num_idx` (`match_home_team_num`),
  KEY `match_away_team_num_idx` (`match_away_team_num`),
  CONSTRAINT `match_away_team_num` FOREIGN KEY (`match_away_team_num`) REFERENCES `team` (`team_num`),
  CONSTRAINT `match_home_team_num` FOREIGN KEY (`match_home_team_num`) REFERENCES `team` (`team_num`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match`
--

LOCK TABLES `match` WRITE;
/*!40000 ALTER TABLE `match` DISABLE KEYS */;
INSERT INTO `match` VALUES (1,1,2,'Champions','05/01','AM 04:00',1,1,'무'),(2,1,4,'League','05/02','PM 11:00',4,2,'승'),(3,1,5,'League','05/04','',4,2,'승'),(4,1,6,'League','05/11',NULL,2,2,'무'),(5,1,3,'Champions','05/14',NULL,0,2,'패'),(6,1,2,'League','05/21',NULL,1,1,'무'),(7,1,4,'League','05/23',NULL,0,1,'패'),(8,1,2,'Champions','06/10',NULL,3,1,'승'),(9,1,6,'League','06/14',NULL,3,2,'승'),(10,1,5,'League','06/20',NULL,2,3,'패'),(11,1,4,'League',NULL,NULL,14,4,'승'),(12,1,4,NULL,NULL,NULL,4,5,'패');
/*!40000 ALTER TABLE `match` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:40
