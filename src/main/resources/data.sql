REPLACE INTO `role` VALUES (1,'ROOT');
REPLACE INTO `role` VALUES (2,'USER');
--replace into `t_user` values (100,"hello","123456","1339170","xinxi@ruc.edu.cn",1);
replace into `car_rental`(carPlate,carBrand,carName,cartype,rentalLoc,returnLoc,carRemaining,carPrice) values("京AL0000","宝马","C300L",0,"北京","北京",5,300);
replace into `hotels`(hotelId,hotelName,hotelPhone,hotelState,hotelCity,hotelAddress,appintmentTime,hotelRemaining,hotelStar,hotelComment,hotelPrice) values(67,"如家","6767","北京","北京","海淀","2018-12-12",5,9,100,3);


replace into `airlines`(airlineId,departure,destination,departureTime,arrivalTime,airlinePrice,remainNum,duration,status)
	values(1,"南昌","北京","2018-12-12","2018-12-12",800,9,7,1);
replace into `airlines`(airlineId,departure,destination,departureTime,arrivalTime,airlinePrice,remainNum,duration,status)
	values(1,"北京","南昌","2018-12-14","2018-12-14",800,9,7,1);


replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(45,"八达岭","123554","北京","北京","延庆区",3,4,80);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(10,"八达岭长城","123554","北京","北京","昌平区",3,4,80);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(1,"故宫","62516251","北京","北京","长安街",5,9,40);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(2,"天安门","62516252","北京","北京","长安街1号",5,10,10);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(3,"外滩","62516253","上海","上海","南京路",3,9,0);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(4,"城隍庙","62516254","上海","上海","南京路1号",3,7,120);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(5,"五大道商业中心","62516255","上海","上海","南京路2号",3,8,0);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(6,"世界之窗","62516256","深圳","深圳","深南大道1号",3,6,180);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(7,"华侨城","62516257","深圳","深圳","深南大道1号",3,7,80);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(8,"意大利风情街","62516258","天津","天津","五大道1号",4,8,0);
replace into `attractions`(attractionId,attractionName,attractionPhone,attractionState,attractionCity,attractionAddress,attractionStar,attractionComment,attractionPrice) values(9,"天津之眼","62516259","天津","天津","五大道2号",4,9,200);

replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(79,0,21,"Vivian","1234436","北京","延庆",45,200,80);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(9,0,21,"小华","1234431","上海","上海",3,10,220);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(1,0,31,"小明","1234432","上海","上海",4,9,200);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(2,0,41,"小花","1234433","上海","上海",5,8,210);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(3,0,51,"小玉","1234434","北京","北京",2,8,230);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(4,0,22,"小鹏","1234435","北京","北京",3,9,240);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(5,1,23,"小阳","1234436","北京","北京",10,10,270);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(6,1,24,"小芳","1234437","天津","天津",8,7,100);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(7,1,25,"小魏","1234438","天津","天津",9,2,280);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(8,1,26,"小柴","1234439","深圳","深圳",6,6,150);
replace into `guides`(guideId,guideGender,guideAge,guideName,guidePhone,guideState,guideCity,guideAttractionId,guideComment,guidePrice) values(10,1,27,"小翔","1234430","深圳","深圳",7,10,180);