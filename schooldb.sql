-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 24, 2022 at 04:53 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schooldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `config`
--

CREATE TABLE `config` (
  `darkmode` int(11) NOT NULL DEFAULT '0',
  `id` int(11) NOT NULL,
  `schoolname` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `config`
--

INSERT INTO `config` (`darkmode`, `id`, `schoolname`) VALUES
(1, 1, 'HNHS SIS');

-- --------------------------------------------------------

--
-- Table structure for table `grades1`
--

CREATE TABLE `grades1` (
  `math` int(11) NOT NULL,
  `science` int(11) NOT NULL,
  `english` int(11) NOT NULL DEFAULT '0',
  `tle` int(11) NOT NULL DEFAULT '0',
  `filifino` int(11) NOT NULL DEFAULT '0',
  `fullname` varchar(250) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades1`
--

INSERT INTO `grades1` (`math`, `science`, `english`, `tle`, `filifino`, `fullname`, `id`) VALUES
(100, 100, 100, 100, 100, 'Joshua Escano', 5),
(1, 1, 1, 1, 1, 'x', 6),
(0, 0, 0, 0, 0, 'xx', 7),
(89, 89, 89, 89, 89, 'John', 8),
(0, 0, 0, 0, 0, 'datzine', 9),
(0, 0, 0, 0, 0, '1', 10),
(0, 0, 0, 0, 0, 'zz', 11),
(89, 90, 90, 90, 90, 'sex', 12),
(0, 0, 0, 0, 0, '1', 13),
(0, 0, 0, 0, 0, 'johnxs sx', 14),
(80, 80, 89, 75, 71, 'John Smith', 15);

-- --------------------------------------------------------

--
-- Table structure for table `grades2`
--

CREATE TABLE `grades2` (
  `math` int(11) NOT NULL,
  `science` int(11) NOT NULL,
  `english` int(11) NOT NULL DEFAULT '0',
  `tle` int(11) NOT NULL DEFAULT '0',
  `filifino` int(11) NOT NULL DEFAULT '0',
  `fullname` varchar(250) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades2`
--

INSERT INTO `grades2` (`math`, `science`, `english`, `tle`, `filifino`, `fullname`, `id`) VALUES
(100, 100, 100, 99, 100, 'Joshua Escano', 5),
(81, 80, 81, 81, 81, 'x', 6),
(0, 0, 0, 0, 0, 'xx', 7),
(122, 12, 12, 12, 12, 'John', 8),
(0, 0, 0, 0, 0, 'datzine', 9),
(0, 0, 0, 0, 0, '1', 10),
(0, 0, 0, 0, 0, 'zz', 11),
(0, 0, 0, 0, 0, 'sex', 12),
(0, 0, 0, 0, 0, '1', 13),
(0, 0, 0, 0, 0, 'johnxs sx', 14),
(89, 88, 88, 88, 99, 'John Smith', 15);

-- --------------------------------------------------------

--
-- Table structure for table `grades3`
--

CREATE TABLE `grades3` (
  `math` int(11) NOT NULL,
  `science` int(11) NOT NULL,
  `english` int(11) NOT NULL DEFAULT '0',
  `tle` int(11) NOT NULL DEFAULT '0',
  `filifino` int(11) NOT NULL DEFAULT '0',
  `fullname` varchar(250) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades3`
--

INSERT INTO `grades3` (`math`, `science`, `english`, `tle`, `filifino`, `fullname`, `id`) VALUES
(100, 100, 100, 100, 100, 'Joshua Escano', 5),
(0, 0, 0, 0, 0, 'x', 6),
(0, 0, 0, 0, 0, 'xx', 7),
(0, 0, 0, 0, 0, 'John', 8),
(0, 0, 0, 0, 0, 'datzine', 9),
(0, 0, 0, 0, 0, '1', 10),
(0, 0, 0, 0, 0, 'zz', 11),
(0, 0, 0, 0, 0, 'sex', 12),
(0, 0, 0, 0, 0, '1', 13),
(0, 0, 0, 0, 0, 'johnxs sx', 14),
(0, 0, 0, 0, 0, 'John Smith', 15);

-- --------------------------------------------------------

--
-- Table structure for table `grades4`
--

CREATE TABLE `grades4` (
  `math` int(11) NOT NULL,
  `science` int(11) NOT NULL,
  `english` int(11) NOT NULL DEFAULT '0',
  `tle` int(11) NOT NULL DEFAULT '0',
  `filifino` int(11) NOT NULL DEFAULT '0',
  `fullname` varchar(250) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grades4`
--

INSERT INTO `grades4` (`math`, `science`, `english`, `tle`, `filifino`, `fullname`, `id`) VALUES
(100, 100, 100, 94, 100, 'Joshua Escano', 5),
(0, 0, 0, 0, 0, 'x', 6),
(0, 0, 0, 0, 0, 'xx', 7),
(0, 0, 0, 0, 0, 'John', 8),
(0, 0, 0, 0, 0, 'datzine', 9),
(0, 0, 0, 0, 0, '1', 10),
(0, 0, 0, 0, 0, 'zz', 11),
(0, 0, 0, 0, 0, 'sex', 12),
(0, 0, 0, 0, 0, '1', 13),
(0, 0, 0, 0, 0, 'johnxs sx', 14),
(0, 0, 0, 0, 0, 'John Smith', 15);

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE `notes` (
  `fullname` varchar(255) NOT NULL,
  `note` varchar(255) NOT NULL,
  `teacher` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notes`
--

INSERT INTO `notes` (`fullname`, `note`, `teacher`, `id`) VALUES
('sex', 'wewweew', 'qwerty', 1),
('sex', 'Hi hope you are good', 'qwerty', 2),
('sex', 'Hi hope you are good', 'qwerty', 3),
('Select Student', 'aaa', 'qwerty', 4),
('Select Student', 'wew', 'qwerty', 5),
('John Smith', 'THIS IS A TEST FOR MEMO', 'qwerty', 6);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `previllege` int(255) DEFAULT '0',
  `position` varchar(255) DEFAULT NULL,
  `fullname` varchar(250) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `previllege`, `position`, `fullname`, `id`, `status`) VALUES
('qwerty', 'd8578edf8458ce06fbc5bb76a58c5ca4', 1, NULL, 'qwerty', 12, 0),
('johnsmithx', '7b9dc501afe4ee11c56a4831e20cee71', 0, NULL, 'John Smith', 19, 0),
('admin', '21232f297a57a5a743894a0e4a801fc3', 1, NULL, 'admin', 20, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `grades1`
--
ALTER TABLE `grades1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `grades2`
--
ALTER TABLE `grades2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `grades3`
--
ALTER TABLE `grades3`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `grades4`
--
ALTER TABLE `grades4`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `notes`
--
ALTER TABLE `notes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `config`
--
ALTER TABLE `config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `grades1`
--
ALTER TABLE `grades1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `grades2`
--
ALTER TABLE `grades2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `grades3`
--
ALTER TABLE `grades3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `grades4`
--
ALTER TABLE `grades4`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `notes`
--
ALTER TABLE `notes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
