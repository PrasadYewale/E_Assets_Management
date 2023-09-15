# E_Assets_Management
Team Cyber-Assets Sentinel's Repo.
### Project Struture :
```bash 
.gitignore
BackEnd
   |-- src
   |   |-- main
   |   |   |-- com
   |   |   |   |-- Application.java
   |   |   |   |-- sentinels
   |   |   |   |   |-- dao
   |   |   |   |   |   |-- AssetDAO.java
   |   |   |   |   |   |-- AssetDAOImpl.java
   |   |   |   |   |   |-- AssetInventoryDAO.java
   |   |   |   |   |   |-- AssetInventoryDAOImpl.java
   |   |   |   |   |   |-- UserDAO.java
   |   |   |   |   |   |-- UserDAOImpl.java
   |   |   |   |   |-- db
   |   |   |   |   |   |-- DataSourceConnectionFactory.java
   |   |   |   |   |-- exceptions
   |   |   |   |   |   |-- AssetAlreadyExistsException.java
   |   |   |   |   |   |-- AssetNotFoundException.java
   |   |   |   |   |   |-- AssetUnavailableException.java
   |   |   |   |   |   |-- AuthenticationException.java
   |   |   |   |   |   |-- UserAlreadyExistsException.java
   |   |   |   |   |   |-- UserNotFoundException.java
   |   |   |   |   |-- model
   |   |   |   |   |   |-- Asset.java
   |   |   |   |   |   |-- AssetInventory.java
   |   |   |   |   |   |-- Category.java
   |   |   |   |   |   |-- Role.java
   |   |   |   |   |   |-- Status.java
   |   |   |   |   |   |-- User.java
   |   |   |   |   |-- service
   |   |   |   |   |   |-- AdminService.java
   |   |   |   |   |   |-- AdminServiceImpl.java
   |   |   |   |   |   |-- UserImportService.java
   |   |   |   |   |   |-- UserService.java
   |   |   |   |   |   |-- UserServiceImpl.java
   |   |   |   |-- util
   |   |   |   |   |-- DatabaseUtil.java
   |   |   |-- resources
   |   |   |   |-- db.properties
   |   |   |   |-- users.json
PPT_CyberAsset_Sentinels.pdf
README.md
TestCases.pdf
UML_Diagrams_.pdf
WebContent
   |-- assets
   |   |-- css
   |   |   |-- style.css
   |   |-- img
   |   |   |-- 4.png
   |   |   |-- 5.png
   |   |   |-- about
   |   |   |   |-- 1.png
   |   |   |-- bg1.jpeg
   |   |   |-- bg2.jpeg
   |   |   |-- bg3.png
   |   |-- js
   |   |   |-- main.js
   |   |   |
   |-- index.html
   |-- pages
   |   |-- Admin and user
   |   |   |-- admin.html
   |   |   |-- css
   |   |   |   |-- animate.css
   |   |   |   |-- calendar.css
   |   |   |   |-- custom.css
   |   |   |-- fonts
   |   |   |   |-- Flaticon.eot
   |   |   |   |-- Flaticon.svg
   |   |   |   |-- Flaticon.ttf
   |   |   |   |-- Flaticon.woff
   |   |   |   |-- FontAwesome.otf
   |   |   |   |-- _flaticon.scss
   |   |   |   |-- flaticon.css
   |   |   |   |-- flaticon.html
   |   |   |   |-- fontawesome-webfont.eot
   |   |   |   |-- fontawesome-webfont.svg
   |   |   |   |-- fontawesome-webfont.ttf
   |   |   |   |-- fontawesome-webfont.woff
   |   |   |   |-- fontawesome-webfont.woff2
   |   |   |   |-- glyphicons-halflings-regular.eot
   |   |   |   |-- glyphicons-halflings-regular.svg
   |   |   |   |-- glyphicons-halflings-regular.ttf
   |   |   |   |-- glyphicons-halflings-regular.woff
   |   |   |   |-- glyphicons-halflings-regular.woff2
   |   |   |-- images
   |   |   |   |-- E _icon.webp
   |   |   |   |-- layout_img
   |   |   |   |   |-- msg1.png
   |   |   |   |   |-- msg2.png
   |   |   |   |   |-- msg3.png
   |   |   |   |   |-- msg4.png
   |   |   |   |   |-- msg5.png
   |   |   |   |   |-- user_img.jpg
   |   |   |   |-- logo
   |   |   |   |   |-- profile-user.png
   |   |   |-- js
   |   |   |   |-- Chart.bundle.js
   |   |   |   |-- Chart.bundle.min.js
   |   |   |   |-- Chart.js
   |   |   |   |-- Chart.min.js
   |   |   |   |-- analyser.js
   |   |   |   |-- animate.js
   |   |   |   |-- bootstrap-select.js
   |   |   |   |-- bootstrap.bundle.js
   |   |   |   |-- bootstrap.bundle.js.map
   |   |   |   |-- bootstrap.bundle.min.js
   |   |   |   |-- bootstrap.bundle.min.js.map
   |   |   |   |-- bootstrap.js
   |   |   |   |-- bootstrap.js.map
   |   |   |   |-- bootstrap.min.js
   |   |   |   |-- bootstrap.min.js.map
   |   |   |   |-- calendar.js
   |   |   |   |-- calendar.min.js
   |   |   |   |-- chart_custom_style1.js
   |   |   |   |-- chart_custom_style2.js
   |   |   |   |-- custom.js
   |   |   |   |-- custom_chart.js
   |   |   |   |-- jquery-3.3.1.min.js
   |   |   |   |-- jquery.fancybox.js
   |   |   |   |-- jquery.fancybox.min.js
   |   |   |   |-- jquery.min.js
   |   |   |   |-- owl.carousel.js
   |   |   |   |-- perfect-scrollbar.min.js
   |   |   |   |-- popper.min.js
   |   |   |   |-- semantic.min.js
   |   |   |   |-- settings.html
   |   |   |   |-- utils.js
   |   |   |-- style.css
   |   |   |-- user.html
   |   |-- Login
   |   |   |-- images
   |   |   |   |-- image1.jpg
   |   |   |   |-- image2.jpg
   |   |   |   |-- image3.jpg
   |   |   |   |-- image4.jpg
   |   |   |   |-- image5.jpg
   |   |   |   |-- image6.jpg
   |   |   |-- login.html
   |   |   |-- loginbtn.js
   |   |   |-- registration.html
   |   |   |-- scrpit.js
   |   |   |-- style.css
   |   |-- import user
   |   |   |-- importUser.html
   |   |   |-- style2.css
```
