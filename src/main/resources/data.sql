-- 어드민 계정 insert
INSERT INTO member VALUES(1, NOW(), NOW(), 'admin@monthler.com', '어드민', 123456, null, 'ADMIN', 'SELF');

-- 테마 카테고리 insert
INSERT INTO category VALUES(1, '여행');
INSERT INTO category VALUES(2, '워케이션');
INSERT INTO category VALUES(3, '프로젝트');
INSERT INTO category VALUES(4, '귀농귀촌');

-- 지역공고 insert
INSERT INTO gov_notice VALUES(1, NOW(), NOW(), '동해', '아름다운 바다도시 동해로 요세요!', 'bada@naver.com', '아룸다운 바다도시 동해로 요세요!', 8, 5, 1, 2, 'http://donghae.com', '010-1234-5678', NOW(), NOW(), 3, '관련파일 url', '강원도', NOW(),  NOW(), NOW(), 120000, '동해바다로오세요', 'Y', 1);
insert into theme values(1, 1, 1);
insert into theme values(2, 2, 1);

INSERT INTO gov_notice VALUES(2, NOW(), NOW(), '목포', '전남 목포 일주일살기 <SAFE하게 FLEX 하자!> 3, 4차 모집', 'jeonnam@naver.com', '목포에서 일주일 살기 가능할까요?! 지원 해보세요.', 3, 15, 2, 20, 'http://jeonnam.com', '010-1111-2222', NOW(), NOW(), 3, '관련파일 url2', '전남', NOW(),  NOW(), NOW(), 100000, '목포에서 일주일 살기!!', 'N', 1);
insert into theme values(3, 3, 2);
insert into theme values(4, 4, 2);

INSERT INTO gov_notice VALUES(3, NOW(), NOW(), '장항', '장항 워케이션 참가자 모집', 'janghang@naver.com', '장항 워케이션 모집 합니다.', 10, 20, 1, 100, 'http://janghang.com', '010-9999-8888', NOW(), NOW(), 3, '관련파일 url3', '그 외', NOW(),  NOW(), NOW(), 100000, '장항에서 일해보자!', 'Y', 1);
insert into theme values(5, 1, 3);
insert into theme values(6, 2, 3);
insert into theme values(7, 3, 3);