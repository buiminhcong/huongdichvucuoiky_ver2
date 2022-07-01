# huongdichvucuoiky_ver2
#Giới thiệu:

Dịch vụ tra điểm và kết quả ra trường sử dụng kiến trúc microservice, xây dựng bằng spring boot và eureka
Dịch vụ bao gồm:
1 API Gateway giúp chúng ta có thể định tuyến một request bất kỳ tới các service bên trong thông qua request parameter
1 service registry sử dụng eureka để quản lý, đặt tên cho các service
1 utility service notification để thông báo điểm và kết quả ra trường cho sinh viên
1 dịch vụ verify của bên thứ 3
2 dịch vụ: Student lưu thông tin sinh viên, Transcript lưu điểm sinh viên.
Cài đặt môi trường:
b1. Cài đặt IntelIj
b2. cài đặt môi trường maven, java
b3. Cài đặt mysql
Chạy chương trình
b1. start dịch vụ Student Transcrip ubility service notification
b2. start dịch vụ eureka-server và chạy trên cổng 8761 bạn sẽ thấy các dịch vụ đang chạy
![image](https://user-images.githubusercontent.com/93995859/176824901-3b5438bc-9ae1-464f-bad1-12e9a02069c5.png)

b3 truy cập ứng dụng client truy cập cổng 8080/client/view à nhập theo định dạng
![image](https://user-images.githubusercontent.com/93995859/176824848-653a94b4-0b92-43f3-8721-55f5d29ed0a9.png)

