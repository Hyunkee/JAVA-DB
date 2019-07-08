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
-- Table structure for table `goals`
--

DROP TABLE IF EXISTS `goals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `goals` (
  `goals_num` int(11) NOT NULL AUTO_INCREMENT,
  `goals_match_num` int(11) DEFAULT NULL,
  `goals_player_num` int(11) DEFAULT NULL,
  `goals_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`goals_num`),
  KEY `goals_match_num_idx` (`goals_match_num`),
  KEY `goals_player_num_idx` (`goals_player_num`),
  CONSTRAINT `goals_match_num` FOREIGN KEY (`goals_match_num`) REFERENCES `match` (`match_num`),
  CONSTRAINT `goals_player_num` FOREIGN KEY (`goals_player_num`) REFERENCES `player` (`player_num`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goals`
--

LOCK TABLES `goals` WRITE;
/*!40000 ALTER TABLE `goals` DISABLE KEYS */;
INSERT INTO `goals` VALUES (1,11,4,'04:35'),(2,11,5,'06:10'),(3,11,6,'07:10'),(4,11,5,NULL),(5,11,4,NULL),(6,11,4,NULL),(7,11,2,NULL),(8,11,3,NULL),(9,11,5,NULL),(10,11,6,NULL),(11,11,3,NULL),(12,11,1,NULL),(13,11,7,NULL),(14,11,7,NULL),(15,10,5,NULL),(16,10,9,NULL),(17,1,14,NULL),(22,2,17,NULL),(23,2,18,NULL),(24,2,21,NULL),(25,2,20,NULL),(26,12,7,NULL),(27,12,8,NULL),(28,12,9,NULL),(29,12,10,NULL);
/*!40000 ALTER TABLE `goals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:41
