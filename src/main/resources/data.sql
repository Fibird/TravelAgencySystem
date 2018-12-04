REPLACE INTO `role` VALUES (1,'ROOT');
REPLACE INTO `role` VALUES (2,'USER');
-- replace into `t_user` values (100,"hello","123456","1339170","xinxi@ruc.edu.cn",1);
replace into `car_rental`(carId,carBrand,carName,cartype,rentalLoc,returnLoc,carRemaining,carPrice) values(300,"baoma","C300L",0,"beijinghaidian","RUC",5,300);
replace into `hotels`(hotelId,hotelName,hotelPhone,hotelState,hotelCity,hotelAddress,appintmentTime,hotelRemaining,hotelStar,hotelComment,hotelPrice) values(67,"rujia","6767","beijing","beijing","haidian","2018-11-14",5,9,100,3);
--replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(45,"badaling","123554","jiangxi","nanchang","nanjinglu",3,4,80);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(5,0,21,"zihan","1234436","hebei","xingtai",899,200,9);