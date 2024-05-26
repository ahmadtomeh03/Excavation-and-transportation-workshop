-- MySQL dump 10.13  Distrib 5.1.35, for Win32 (ia32)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	5.1.35-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `additional_acts`
--

DROP TABLE IF EXISTS `additional_acts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_acts` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Hour_Price` int(11) NOT NULL,
  `Job_Description` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_acts`
--

LOCK TABLES `additional_acts` WRITE;
/*!40000 ALTER TABLE `additional_acts` DISABLE KEYS */;
/*!40000 ALTER TABLE `additional_acts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `akwab`
--

DROP TABLE IF EXISTS `akwab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `akwab` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Number_Of_Akwab` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `sumation` int(11) DEFAULT NULL,
  `ID_workshops` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `akwab_workshops` (`ID_workshops`),
  CONSTRAINT `akwab_workshops` FOREIGN KEY (`ID_workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `akwab`
--

LOCK TABLES `akwab` WRITE;
/*!40000 ALTER TABLE `akwab` DISABLE KEYS */;
/*!40000 ALTER TABLE `akwab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cash`
--

DROP TABLE IF EXISTS `cash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cash` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `salary` int(11) NOT NULL,
  `date_paid` date DEFAULT NULL,
  `kind` varchar(225) DEFAULT NULL,
  `Advance_Payment` tinyint(1) DEFAULT NULL,
  `ID_Number` varchar(225) DEFAULT NULL,
  `ID_Station` int(11) DEFAULT NULL,
  `ID_Mechanism` varchar(225) DEFAULT NULL,
  `ID_Workshops` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `cash_stations` (`ID_Station`),
  KEY `cash_mechanism` (`ID_Mechanism`),
  KEY `cash_emp` (`ID_Number`),
  KEY `fk_workshop_id` (`ID_Workshops`),
  CONSTRAINT `cash_employee` FOREIGN KEY (`ID_Number`) REFERENCES `employees` (`ID_Number`),
  CONSTRAINT `cash_mechanism` FOREIGN KEY (`ID_Mechanism`) REFERENCES `mechanism` (`ID`),
  CONSTRAINT `cash_stations` FOREIGN KEY (`ID_Station`) REFERENCES `stations` (`ID`),
  CONSTRAINT `fk_workshop_id` FOREIGN KEY (`ID_Workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cash`
--

LOCK TABLES `cash` WRITE;
/*!40000 ALTER TABLE `cash` DISABLE KEYS */;
/*!40000 ALTER TABLE `cash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheque`
--

DROP TABLE IF EXISTS `cheque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheque` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Doubt_Number` int(11) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Received_Date` date NOT NULL,
  `Data_Spending_The_Money` date NOT NULL,
  `kind` varchar(225) DEFAULT NULL,
  `Advance_Payment` tinyint(1) DEFAULT NULL,
  `ID_Number` varchar(225) DEFAULT NULL,
  `ID_Station` int(11) DEFAULT NULL,
  `ID_mechanism` varchar(225) DEFAULT NULL,
  `Name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `state_of_doubt` tinyint(1) NOT NULL DEFAULT '1',
  `ID_Workshops` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `cheque_employee` (`ID_Number`),
  KEY `cheque_station` (`ID_Station`),
  KEY `cheque_mechanism` (`ID_mechanism`),
  KEY `fkcheque_workshop_id` (`ID_Workshops`),
  CONSTRAINT `cheque_employee` FOREIGN KEY (`ID_Number`) REFERENCES `employees` (`ID_Number`),
  CONSTRAINT `cheque_mechanism` FOREIGN KEY (`ID_mechanism`) REFERENCES `mechanism` (`ID`),
  CONSTRAINT `cheque_station` FOREIGN KEY (`ID_Station`) REFERENCES `stations` (`ID`),
  CONSTRAINT `fkcheque_workshop_id` FOREIGN KEY (`ID_Workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheque`
--

LOCK TABLES `cheque` WRITE;
/*!40000 ALTER TABLE `cheque` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_additional_acts`
--

DROP TABLE IF EXISTS `employee_additional_acts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_additional_acts` (
  `ID_Additional_Acts` int(11) NOT NULL DEFAULT '0',
  `ID_Number` varchar(225) NOT NULL DEFAULT '',
  `Number_Of_Hour` int(11) DEFAULT NULL,
  `Sumation` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Additional_Acts`,`ID_Number`),
  KEY `ID_Number` (`ID_Number`),
  CONSTRAINT `employee_additional_acts_ibfk_3` FOREIGN KEY (`ID_Number`) REFERENCES `employees` (`ID_Number`),
  CONSTRAINT `employee_additional_acts_ibfk_4` FOREIGN KEY (`ID_Additional_Acts`) REFERENCES `additional_acts` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_additional_acts`
--

LOCK TABLES `employee_additional_acts` WRITE;
/*!40000 ALTER TABLE `employee_additional_acts` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_additional_acts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `ID_Number` varchar(225) NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Salary` int(11) NOT NULL,
  `Phone` varchar(225) DEFAULT NULL,
  `Date_Join` date DEFAULT NULL,
  PRIMARY KEY (`ID_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('400200256','عبد الكريم عمر ',4500,'0599123589','2024-05-26'),('408612345','محمد أحمد ',4000,'0595123456','2024-05-26');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hours_paid`
--

DROP TABLE IF EXISTS `hours_paid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hours_paid` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Price` int(11) NOT NULL,
  `Number_Of_Hour` int(11) NOT NULL,
  `note` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `sumation` int(11) DEFAULT NULL,
  `ID_workshops` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `hours_workshops` (`ID_workshops`),
  CONSTRAINT `hours_workshops` FOREIGN KEY (`ID_workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hours_paid`
--

LOCK TABLES `hours_paid` WRITE;
/*!40000 ALTER TABLE `hours_paid` DISABLE KEYS */;
/*!40000 ALTER TABLE `hours_paid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintenance` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Mechanism` varchar(225) DEFAULT NULL,
  `Date_Maintenance` date DEFAULT NULL,
  `salry` int(11) DEFAULT NULL,
  `shop_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `kind` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `name_of_mechanism` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `mechanism_id` (`ID_Mechanism`),
  CONSTRAINT `mechanism_id` FOREIGN KEY (`ID_Mechanism`) REFERENCES `mechanism` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance`
--

LOCK TABLES `maintenance` WRITE;
/*!40000 ALTER TABLE `maintenance` DISABLE KEYS */;
/*!40000 ALTER TABLE `maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mechanism`
--

DROP TABLE IF EXISTS `mechanism`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mechanism` (
  `ID` varchar(225) NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Price` int(11) NOT NULL,
  `Hour_Price` int(11) NOT NULL,
  `sold` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mechanism`
--

LOCK TABLES `mechanism` WRITE;
/*!40000 ALTER TABLE `mechanism` DISABLE KEYS */;
INSERT INTO `mechanism` VALUES ('2222H','جرافة ',250000,150,0),('2369G','قلاب نقل ',500000,250,0);
/*!40000 ALTER TABLE `mechanism` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muqawila`
--

DROP TABLE IF EXISTS `muqawila`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `muqawila` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `price` int(11) NOT NULL,
  `ID_workshops` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `muqawila_workshops` (`ID_workshops`),
  CONSTRAINT `muqawila_workshops` FOREIGN KEY (`ID_workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muqawila`
--

LOCK TABLES `muqawila` WRITE;
/*!40000 ALTER TABLE `muqawila` DISABLE KEYS */;
/*!40000 ALTER TABLE `muqawila` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operating_expenses`
--

DROP TABLE IF EXISTS `operating_expenses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operating_expenses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note` varchar(255) DEFAULT NULL,
  `amount` int(11) NOT NULL,
  `dates` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operating_expenses`
--

LOCK TABLES `operating_expenses` WRITE;
/*!40000 ALTER TABLE `operating_expenses` DISABLE KEYS */;
/*!40000 ALTER TABLE `operating_expenses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `station_mechanism`
--

DROP TABLE IF EXISTS `station_mechanism`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `station_mechanism` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Mechanism` varchar(225) NOT NULL,
  `ID_Station` int(11) NOT NULL,
  `Withdraw_Balance` int(11) DEFAULT NULL,
  `Withdrawal_Date` date DEFAULT NULL,
  `note` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `station_temp` (`ID_Station`),
  KEY `mechanism_temp` (`ID_Mechanism`),
  CONSTRAINT `mechanism_temp` FOREIGN KEY (`ID_Mechanism`) REFERENCES `mechanism` (`ID`),
  CONSTRAINT `station_temp` FOREIGN KEY (`ID_Station`) REFERENCES `stations` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station_mechanism`
--

LOCK TABLES `station_mechanism` WRITE;
/*!40000 ALTER TABLE `station_mechanism` DISABLE KEYS */;
/*!40000 ALTER TABLE `station_mechanism` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stations`
--

DROP TABLE IF EXISTS `stations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stations` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Station_Owner_Name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Phone` varchar(225) DEFAULT NULL,
  `Balance` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stations`
--

LOCK TABLES `stations` WRITE;
/*!40000 ALTER TABLE `stations` DISABLE KEYS */;
INSERT INTO `stations` VALUES (9,'القدس ','محمد كريم ','0598125689',3000);
/*!40000 ALTER TABLE `stations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workshops`
--

DROP TABLE IF EXISTS `workshops`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workshops` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name_Workshops` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `phone` varchar(225) NOT NULL,
  `Type_Workshops` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Name_Owner` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Date_Begin` date DEFAULT NULL,
  `Type_Paid` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workshops`
--

LOCK TABLES `workshops` WRITE;
/*!40000 ALTER TABLE `workshops` DISABLE KEYS */;
INSERT INTO `workshops` VALUES (9,'طولكرم ','0599258369','نقلية','عبد الرحيم علي ','2024-06-06','ساعات '),(10,'جنين','0599258367','طمم','كريم أحمد  ','2024-06-07','أكواب');
/*!40000 ALTER TABLE `workshops` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workshops_mechanism`
--

DROP TABLE IF EXISTS `workshops_mechanism`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workshops_mechanism` (
  `ID_Mechanism` varchar(225) NOT NULL,
  `ID_workshops` int(11) NOT NULL,
  `Number_Of_Hour` int(11) NOT NULL,
  `Sumation` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Mechanism`,`ID_workshops`),
  KEY `workshops_id` (`ID_workshops`),
  CONSTRAINT `mechanism_idd` FOREIGN KEY (`ID_Mechanism`) REFERENCES `mechanism` (`ID`),
  CONSTRAINT `workshops_id` FOREIGN KEY (`ID_workshops`) REFERENCES `workshops` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workshops_mechanism`
--

LOCK TABLES `workshops_mechanism` WRITE;
/*!40000 ALTER TABLE `workshops_mechanism` DISABLE KEYS */;
/*!40000 ALTER TABLE `workshops_mechanism` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-26 15:37:10
