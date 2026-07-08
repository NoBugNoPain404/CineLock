create table cine_management.cinema (
    id integer not null primary key,
    name varchar(255) not null,
    address varchar(255) not null,
    city integer references cine_management.city(id),
    latitude decimal(10, 8),
    longitude decimal(11, 8),
    phone varchar(20),
    email varchar(255),
    status varchar(255),
    image varchar(255),
    created_at timestamp not null default now(),
    updated_at timestamp
);

create index idx_cinema_info on cine_management.cinema(id)
include (name, address, city, latitude, longitude, phone, email, status);

INSERT INTO cine_management.cinema (
    id, name, address, city, latitude, longitude, phone, email, status, image, created_at, updated_at
) VALUES
      (
          1,
          'CineStar Nguyễn Trãi',
          '271 Nguyễn Trãi, Phường Nguyễn Cư Trinh, Quận 1',
          32, -- Khớp với ID của TP. Hồ Chí Minh
          10.76262200, 106.68944400,
          '02873001014', 'contact.nt@cinestar.com.vn',
          'ACTIVE', 'images/cinemas/cinestar-nguyen-trai.jpg',
          NOW(), NOW()
      ),
      (
          2,
          'CGV Vincom Nguyễn Chí Thanh',
          'Số 54A Nguyễn Chí Thanh, Phường Láng Thượng, Quận Đống Đa',
          12, -- Khớp với ID của Hà Nội
          21.02273600, 105.80194400,
          '02438353333', 'info.cgvnct@cgv.vn',
          'ACTIVE', 'images/cinemas/cgv-nguyen-chi-thanh.jpg',
          NOW(), NOW()
      ),
      (
          3,
          'Galaxy Đà Nẵng',
          'Tầng 3 TTTM CoopMart, 478 Điện Biên Phủ, Quận Thanh Khê',
          6, -- Khớp với ID của Đà Nẵng
          16.06542200, 108.18534100,
          '19002224', 'support@galaxy.com.vn',
          'ACTIVE', 'images/cinemas/galaxy-da-nang.jpg',
          NOW(), NOW()
      ),
      (
          4,
          'Lotte Cinema Cantavil',
          'Tầng 7 Cantavil Premier, Xa Lộ Hà Nội, Phường An Phú, Quận 2',
          32, -- Khớp với ID của TP. Hồ Chí Minh
          10.80138900, 106.75333300,
          '02837402323', 'cantavil@lotte.vn',
          'ACTIVE', 'images/cinemas/lotte-cantavil.jpg',
          NOW(), NOW()
      ),
      (
          5,
          'BHD Star Phạm Ngọc Thạch',
          'Tầng 8 Vincom Center, 2 Phạm Ngọc Thạch, Quận Đống Đa',
          12, -- Khớp với ID của Hà Nội
          21.00638900, 105.82916700,
          '02436373355', 'bhd.pnt@bhdstar.vn',
          'MAINTENANCE', 'images/cinemas/bhd-pham-ngoc-thach.jpg',
          NOW(), NOW()
      );