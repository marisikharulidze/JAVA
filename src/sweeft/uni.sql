-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 15, 2022 at 01:52 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uni`
--

-- --------------------------------------------------------

--
-- Table structure for table `pupil`
--

CREATE TABLE `pupil` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `class` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pupil`
--

INSERT INTO `pupil` (`id`, `name`, `lastName`, `gender`, `class`) VALUES
(1, 'nini', 'stefanishvili', 'female', '12'),
(2, 'nika', '', 'male', '11');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `subject` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `lastName`, `gender`, `subject`) VALUES
(1, 'giorgi', 'kvarcxelia', 'male', 'math'),
(2, 'eka', 'tsintsadze', 'female', 'physics'),
(3, 'giorgi', '', 'male', 'art');

-- --------------------------------------------------------

--
-- Table structure for table `teacher-pupil`
--

CREATE TABLE `teacher-pupil` (
  `id` int(11) NOT NULL,
  `teacherId` int(11) NOT NULL,
  `pupilId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher-pupil`
--

INSERT INTO `teacher-pupil` (`id`, `teacherId`, `pupilId`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 1, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pupil`
--
ALTER TABLE `pupil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher-pupil`
--
ALTER TABLE `teacher-pupil`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pupil`
--
ALTER TABLE `pupil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `teacher-pupil`
--
ALTER TABLE `teacher-pupil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
