-- 어드민 계정 insert
INSERT INTO member VALUES(1, NOW(), NOW(), 'admin@monthler.com', '어드민', 123456, null, 'ADMIN', 'SELF');

-- 테마 카테고리 insert
INSERT INTO category VALUES(1, '여행');
INSERT INTO category VALUES(2, '워케이션');
INSERT INTO category VALUES(3, '프로젝트');
INSERT INTO category VALUES(4, '귀농귀촌');

-- 지역공고 insert
INSERT INTO gov_notice VALUES(1, NOW(), NOW(), '동해', '아룸다운 바다도시 동해로 요세요!', 'bada@naver.com', '아룸다운 바다도시 동해로 요세요!', 8, 5, 1, 2, 'http://donghae.com', 01033241242, NOW(), NOW(), 3, 'fildID_01', '강원도', NOW(),  NOW(), NOW(), 120000, '동해바다로오세요', 'Y', 1);
insert into theme values(1, 1, 1);
insert into theme values(2, 2, 1);