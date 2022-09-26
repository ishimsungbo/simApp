CREATE TABLE `user` (
                        `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `name` varchar(45) DEFAULT NULL,
                        `email` varchar(45) DEFAULT NULL,
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3