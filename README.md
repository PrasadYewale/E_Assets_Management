# E_Assets_Management
Team Cyber-Assets Sentinel's Repo.
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
   |   |-- vendor
   |   |   |-- animate.css
   |   |   |   |-- animate.compat.css
   |   |   |   |-- animate.css
   |   |   |   |-- animate.min.css
   |   |   |-- bootstrap-icons
   |   |   |   |-- bootstrap-icons.css
   |   |   |   |-- bootstrap-icons.json
   |   |   |   |-- bootstrap-icons.min.css
   |   |   |   |-- bootstrap-icons.scss
   |   |   |   |-- fonts
   |   |   |   |   |-- bootstrap-icons.woff
   |   |   |   |   |-- bootstrap-icons.woff2
   |   |   |-- bootstrap
   |   |   |   |-- css
   |   |   |   |   |-- bootstrap-grid.css
   |   |   |   |   |-- bootstrap-grid.css.map
   |   |   |   |   |-- bootstrap-grid.min.css
   |   |   |   |   |-- bootstrap-grid.min.css.map
   |   |   |   |   |-- bootstrap-grid.rtl.css
   |   |   |   |   |-- bootstrap-grid.rtl.css.map
   |   |   |   |   |-- bootstrap-grid.rtl.min.css
   |   |   |   |   |-- bootstrap-grid.rtl.min.css.map
   |   |   |   |   |-- bootstrap-reboot.css
   |   |   |   |   |-- bootstrap-reboot.css.map
   |   |   |   |   |-- bootstrap-reboot.min.css
   |   |   |   |   |-- bootstrap-reboot.min.css.map
   |   |   |   |   |-- bootstrap-reboot.rtl.css
   |   |   |   |   |-- bootstrap-reboot.rtl.css.map
   |   |   |   |   |-- bootstrap-reboot.rtl.min.css
   |   |   |   |   |-- bootstrap-reboot.rtl.min.css.map
   |   |   |   |   |-- bootstrap-utilities.css
   |   |   |   |   |-- bootstrap-utilities.css.map
   |   |   |   |   |-- bootstrap-utilities.min.css
   |   |   |   |   |-- bootstrap-utilities.min.css.map
   |   |   |   |   |-- bootstrap-utilities.rtl.css
   |   |   |   |   |-- bootstrap-utilities.rtl.css.map
   |   |   |   |   |-- bootstrap-utilities.rtl.min.css
   |   |   |   |   |-- bootstrap-utilities.rtl.min.css.map
   |   |   |   |   |-- bootstrap.css
   |   |   |   |   |-- bootstrap.css.map
   |   |   |   |   |-- bootstrap.min.css
   |   |   |   |   |-- bootstrap.min.css.map
   |   |   |   |   |-- bootstrap.rtl.css
   |   |   |   |   |-- bootstrap.rtl.css.map
   |   |   |   |   |-- bootstrap.rtl.min.css
   |   |   |   |   |-- bootstrap.rtl.min.css.map
   |   |   |   |-- js
   |   |   |   |   |-- bootstrap.bundle.js
   |   |   |   |   |-- bootstrap.bundle.js.map
   |   |   |   |   |-- bootstrap.bundle.min.js
   |   |   |   |   |-- bootstrap.bundle.min.js.map
   |   |   |   |   |-- bootstrap.esm.js
   |   |   |   |   |-- bootstrap.esm.js.map
   |   |   |   |   |-- bootstrap.esm.min.js
   |   |   |   |   |-- bootstrap.esm.min.js.map
   |   |   |   |   |-- bootstrap.js
   |   |   |   |   |-- bootstrap.js.map
   |   |   |   |   |-- bootstrap.min.js
   |   |   |   |   |-- bootstrap.min.js.map
   |   |   |-- boxicons
   |   |   |   |-- css
   |   |   |   |   |-- animations.css
   |   |   |   |   |-- boxicons.css
   |   |   |   |   |-- boxicons.min.css
   |   |   |   |   |-- transformations.css
   |   |   |   |-- fonts
   |   |   |   |   |-- boxicons.eot
   |   |   |   |   |-- boxicons.svg
   |   |   |   |   |-- boxicons.ttf
   |   |   |   |   |-- boxicons.woff
   |   |   |   |   |-- boxicons.woff2
   |   |   |-- glightbox
   |   |   |   |-- css
   |   |   |   |   |-- glightbox.css
   |   |   |   |   |-- glightbox.min.css
   |   |   |   |   |-- plyr.css
   |   |   |   |   |-- plyr.min.css
   |   |   |   |-- js
   |   |   |   |   |-- glightbox.js
   |   |   |   |   |-- glightbox.min.js
   |   |   |-- isotope-layout
   |   |   |   |-- isotope.pkgd.js
   |   |   |   |-- isotope.pkgd.min.js
   |   |   |-- php-email-form
   |   |   |   |-- validate.js
   |   |   |-- swiper
   |   |   |   |-- swiper-bundle.min.css
   |   |   |   |-- swiper-bundle.min.js
   |   |   |   |-- swiper-bundle.min.js.map
   |-- index.html
   |-- pages
   |   |-- Admin and user
   |   |   |-- admin.html
   |   |   |-- css
   |   |   |   |-- animate.css
   |   |   |   |-- baguetteBox.min.css
   |   |   |   |-- bootstrap-grid.css
   |   |   |   |-- bootstrap-grid.css.map
   |   |   |   |-- bootstrap-grid.min.css
   |   |   |   |-- bootstrap-grid.min.css.map
   |   |   |   |-- bootstrap-reboot.css
   |   |   |   |-- bootstrap-reboot.css.map
   |   |   |   |-- bootstrap-reboot.min.css
   |   |   |   |-- bootstrap-reboot.min.css.map
   |   |   |   |-- bootstrap-select.css
   |   |   |   |-- bootstrap.css
   |   |   |   |-- bootstrap.css.map
   |   |   |   |-- bootstrap.min.css
   |   |   |   |-- bootstrap.min.css.map
   |   |   |   |-- calendar.css
   |   |   |   |-- calendar.min.css
   |   |   |   |-- color_2.css
   |   |   |   |-- custom.css
   |   |   |   |-- flaticon.css
   |   |   |   |-- font-awesome.css
   |   |   |   |-- font-awesome.min.css
   |   |   |   |-- jquery.fancybox.css
   |   |   |   |-- jquery.fancybox.min.css
   |   |   |   |-- owl.carousel.css
   |   |   |   |-- perfect-scrollbar.css
   |   |   |   |-- responsive.css
   |   |   |   |-- semantic.min.css
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
   |   |   |-- modules
   |   |   |   |-- zingchart-3d.min.js
   |   |   |   |-- zingchart-animation.min.js
   |   |   |   |-- zingchart-api-annotations.min.js
   |   |   |   |-- zingchart-api-rules.min.js
   |   |   |   |-- zingchart-api.min.js
   |   |   |   |-- zingchart-area.min.js
   |   |   |   |-- zingchart-area3d.min.js
   |   |   |   |-- zingchart-boxplot.min.js
   |   |   |   |-- zingchart-bubble.min.js
   |   |   |   |-- zingchart-bubblepie.min.js
   |   |   |   |-- zingchart-calendar.min.js
   |   |   |   |-- zingchart-chord.min.js
   |   |   |   |-- zingchart-core.min.js
   |   |   |   |-- zingchart-csv.min.js
   |   |   |   |-- zingchart-debug.min.js
   |   |   |   |-- zingchart-dragging.min.js
   |   |   |   |-- zingchart-errorbars.min.js
   |   |   |   |-- zingchart-export.min.js
   |   |   |   |-- zingchart-gauge.min.js
   |   |   |   |-- zingchart-grid.min.js
   |   |   |   |-- zingchart-guide.min.js
   |   |   |   |-- zingchart-hbar.min.js
   |   |   |   |-- zingchart-hbar3d.min.js
   |   |   |   |-- zingchart-hbubble.min.js
   |   |   |   |-- zingchart-hbullet.min.js
   |   |   |   |-- zingchart-hfunnel.min.js
   |   |   |   |-- zingchart-history.min.js
   |   |   |   |-- zingchart-hscatter.min.js
   |   |   |   |-- zingchart-legend.min.js
   |   |   |   |-- zingchart-line.min.js
   |   |   |   |-- zingchart-line3d.min.js
   |   |   |   |-- zingchart-maps-afg.min.js
   |   |   |   |-- zingchart-maps-ago.min.js
   |   |   |   |-- zingchart-maps-alb.min.js
   |   |   |   |-- zingchart-maps-and.min.js
   |   |   |   |-- zingchart-maps-are.min.js
   |   |   |   |-- zingchart-maps-arg.min.js
   |   |   |   |-- zingchart-maps-arm.min.js
   |   |   |   |-- zingchart-maps-aus.min.js
   |   |   |   |-- zingchart-maps-aut.min.js
   |   |   |   |-- zingchart-maps-aze.min.js
   |   |   |   |-- zingchart-maps-bdi.min.js
   |   |   |   |-- zingchart-maps-bel.min.js
   |   |   |   |-- zingchart-maps-ben.min.js
   |   |   |   |-- zingchart-maps-bfa.min.js
   |   |   |   |-- zingchart-maps-bgr.min.js
   |   |   |   |-- zingchart-maps-bih.min.js
   |   |   |   |-- zingchart-maps-blr.min.js
   |   |   |   |-- zingchart-maps-bol.min.js
   |   |   |   |-- zingchart-maps-bra.min.js
   |   |   |   |-- zingchart-maps-brn.min.js
   |   |   |   |-- zingchart-maps-btn.min.js
   |   |   |   |-- zingchart-maps-bwa.min.js
   |   |   |   |-- zingchart-maps-caf.min.js
   |   |   |   |-- zingchart-maps-can.min.js
   |   |   |   |-- zingchart-maps-che.min.js
   |   |   |   |-- zingchart-maps-chl.min.js
   |   |   |   |-- zingchart-maps-chn.min.js
   |   |   |   |-- zingchart-maps-civ.min.js
   |   |   |   |-- zingchart-maps-cmr.min.js
   |   |   |   |-- zingchart-maps-cod.min.js
   |   |   |   |-- zingchart-maps-cog.min.js
   |   |   |   |-- zingchart-maps-col.min.js
   |   |   |   |-- zingchart-maps-cri.min.js
   |   |   |   |-- zingchart-maps-cub.min.js
   |   |   |   |-- zingchart-maps-cyp.min.js
   |   |   |   |-- zingchart-maps-cze.min.js
   |   |   |   |-- zingchart-maps-deu.min.js
   |   |   |   |-- zingchart-maps-dnk.min.js
   |   |   |   |-- zingchart-maps-ecu.min.js
   |   |   |   |-- zingchart-maps-egy.min.js
   |   |   |   |-- zingchart-maps-esp.min.js
   |   |   |   |-- zingchart-maps-espL2.min.js
   |   |   |   |-- zingchart-maps-est.min.js
   |   |   |   |-- zingchart-maps-eth.min.js
   |   |   |   |-- zingchart-maps-fin.min.js
   |   |   |   |-- zingchart-maps-fra.min.js
   |   |   |   |-- zingchart-maps-fraL2.min.js
   |   |   |   |-- zingchart-maps-gab.min.js
   |   |   |   |-- zingchart-maps-gbr.min.js
   |   |   |   |-- zingchart-maps-gbrL2.min.js
   |   |   |   |-- zingchart-maps-geojson.min.js
   |   |   |   |-- zingchart-maps-gha.min.js
   |   |   |   |-- zingchart-maps-gmb.min.js
   |   |   |   |-- zingchart-maps-gnb.min.js
   |   |   |   |-- zingchart-maps-grc.min.js
   |   |   |   |-- zingchart-maps-gtm.min.js
   |   |   |   |-- zingchart-maps-guf.min.js
   |   |   |   |-- zingchart-maps-guy.min.js
   |   |   |   |-- zingchart-maps-hrv.min.js
   |   |   |   |-- zingchart-maps-hun.min.js
   |   |   |   |-- zingchart-maps-ind.min.js
   |   |   |   |-- zingchart-maps-irl.min.js
   |   |   |   |-- zingchart-maps-irn.min.js
   |   |   |   |-- zingchart-maps-isl.min.js
   |   |   |   |-- zingchart-maps-isr.min.js
   |   |   |   |-- zingchart-maps-ita.min.js
   |   |   |   |-- zingchart-maps-jpn.min.js
   |   |   |   |-- zingchart-maps-kaz.min.js
   |   |   |   |-- zingchart-maps-ken.min.js
   |   |   |   |-- zingchart-maps-kor.min.js
   |   |   |   |-- zingchart-maps-kwt.min.js
   |   |   |   |-- zingchart-maps-lao.min.js
   |   |   |   |-- zingchart-maps-lbr.min.js
   |   |   |   |-- zingchart-maps-lie.min.js
   |   |   |   |-- zingchart-maps-ltu.min.js
   |   |   |   |-- zingchart-maps-lux.min.js
   |   |   |   |-- zingchart-maps-lva.min.js
   |   |   |   |-- zingchart-maps-mda.min.js
   |   |   |   |-- zingchart-maps-mex.min.js
   |   |   |   |-- zingchart-maps-mkd.min.js
   |   |   |   |-- zingchart-maps-mne.min.js
   |   |   |   |-- zingchart-maps-moz.min.js
   |   |   |   |-- zingchart-maps-nam.min.js
   |   |   |   |-- zingchart-maps-ncl.min.js
   |   |   |   |-- zingchart-maps-nga.min.js
   |   |   |   |-- zingchart-maps-nld.min.js
   |   |   |   |-- zingchart-maps-nor.min.js
   |   |   |   |-- zingchart-maps-nzl.min.js
   |   |   |   |-- zingchart-maps-omn.min.js
   |   |   |   |-- zingchart-maps-pak.min.js
   |   |   |   |-- zingchart-maps-pan.min.js
   |   |   |   |-- zingchart-maps-per.min.js
   |   |   |   |-- zingchart-maps-phl.min.js
   |   |   |   |-- zingchart-maps-png.min.js
   |   |   |   |-- zingchart-maps-pol.min.js
   |   |   |   |-- zingchart-maps-prt.min.js
   |   |   |   |-- zingchart-maps-qat.min.js
   |   |   |   |-- zingchart-maps-rou.min.js
   |   |   |   |-- zingchart-maps-rus.min.js
   |   |   |   |-- zingchart-maps-rwa.min.js
   |   |   |   |-- zingchart-maps-sen.min.js
   |   |   |   |-- zingchart-maps-slv.min.js
   |   |   |   |-- zingchart-maps-srb.min.js
   |   |   |   |-- zingchart-maps-sur.min.js
   |   |   |   |-- zingchart-maps-svk.min.js
   |   |   |   |-- zingchart-maps-svn.min.js
   |   |   |   |-- zingchart-maps-swe.min.js
   |   |   |   |-- zingchart-maps-tha.min.js
   |   |   |   |-- zingchart-maps-tjk.min.js
   |   |   |   |-- zingchart-maps-topojson.min.js
   |   |   |   |-- zingchart-maps-tun.min.js
   |   |   |   |-- zingchart-maps-tur.min.js
   |   |   |   |-- zingchart-maps-twn.min.js
   |   |   |   |-- zingchart-maps-uga.min.js
   |   |   |   |-- zingchart-maps-ukr.min.js
   |   |   |   |-- zingchart-maps-ury.min.js
   |   |   |   |-- zingchart-maps-usa.min.js
   |   |   |   |-- zingchart-maps-usa_ak.min.js
   |   |   |   |-- zingchart-maps-usa_al.min.js
   |   |   |   |-- zingchart-maps-usa_ar.min.js
   |   |   |   |-- zingchart-maps-usa_az.min.js
   |   |   |   |-- zingchart-maps-usa_ca.min.js
   |   |   |   |-- zingchart-maps-usa_co.min.js
   |   |   |   |-- zingchart-maps-usa_ct.min.js
   |   |   |   |-- zingchart-maps-usa_dc.min.js
   |   |   |   |-- zingchart-maps-usa_de.min.js
   |   |   |   |-- zingchart-maps-usa_fl.min.js
   |   |   |   |-- zingchart-maps-usa_ga.min.js
   |   |   |   |-- zingchart-maps-usa_hi.min.js
   |   |   |   |-- zingchart-maps-usa_ia.min.js
   |   |   |   |-- zingchart-maps-usa_id.min.js
   |   |   |   |-- zingchart-maps-usa_il.min.js
   |   |   |   |-- zingchart-maps-usa_in.min.js
   |   |   |   |-- zingchart-maps-usa_ks.min.js
   |   |   |   |-- zingchart-maps-usa_ky.min.js
   |   |   |   |-- zingchart-maps-usa_la.min.js
   |   |   |   |-- zingchart-maps-usa_ma.min.js
   |   |   |   |-- zingchart-maps-usa_md.min.js
   |   |   |   |-- zingchart-maps-usa_me.min.js
   |   |   |   |-- zingchart-maps-usa_mi.min.js
   |   |   |   |-- zingchart-maps-usa_mn.min.js
   |   |   |   |-- zingchart-maps-usa_mo.min.js
   |   |   |   |-- zingchart-maps-usa_ms.min.js
   |   |   |   |-- zingchart-maps-usa_mt.min.js
   |   |   |   |-- zingchart-maps-usa_nc.min.js
   |   |   |   |-- zingchart-maps-usa_nd.min.js
   |   |   |   |-- zingchart-maps-usa_ne.min.js
   |   |   |   |-- zingchart-maps-usa_nh.min.js
   |   |   |   |-- zingchart-maps-usa_nj.min.js
   |   |   |   |-- zingchart-maps-usa_nm.min.js
   |   |   |   |-- zingchart-maps-usa_nv.min.js
   |   |   |   |-- zingchart-maps-usa_ny.min.js
   |   |   |   |-- zingchart-maps-usa_oh.min.js
   |   |   |   |-- zingchart-maps-usa_ok.min.js
   |   |   |   |-- zingchart-maps-usa_or.min.js
   |   |   |   |-- zingchart-maps-usa_pa.min.js
   |   |   |   |-- zingchart-maps-usa_ri.min.js
   |   |   |   |-- zingchart-maps-usa_sc.min.js
   |   |   |   |-- zingchart-maps-usa_sd.min.js
   |   |   |   |-- zingchart-maps-usa_tn.min.js
   |   |   |   |-- zingchart-maps-usa_tx.min.js
   |   |   |   |-- zingchart-maps-usa_ut.min.js
   |   |   |   |-- zingchart-maps-usa_va.min.js
   |   |   |   |-- zingchart-maps-usa_vt.min.js
   |   |   |   |-- zingchart-maps-usa_wa.min.js
   |   |   |   |-- zingchart-maps-usa_wi.min.js
   |   |   |   |-- zingchart-maps-usa_wv.min.js
   |   |   |   |-- zingchart-maps-usa_wy.min.js
   |   |   |   |-- zingchart-maps-uzb.min.js
   |   |   |   |-- zingchart-maps-ven.min.js
   |   |   |   |-- zingchart-maps-vnm.min.js
   |   |   |   |-- zingchart-maps-world-continents.min.js
   |   |   |   |-- zingchart-maps-world-countries.min.js
   |   |   |   |-- zingchart-maps-yem.min.js
   |   |   |   |-- zingchart-maps-zaf.min.js
   |   |   |   |-- zingchart-maps-zmb.min.js
   |   |   |   |-- zingchart-maps-zwe.min.js
   |   |   |   |-- zingchart-maps.min.js
   |   |   |   |-- zingchart-navpie.min.js
   |   |   |   |-- zingchart-nestedpie.min.js
   |   |   |   |-- zingchart-objects.min.js
   |   |   |   |-- zingchart-pareto.min.js
   |   |   |   |-- zingchart-patterns.min.js
   |   |   |   |-- zingchart-piano.min.js
   |   |   |   |-- zingchart-pie.min.js
   |   |   |   |-- zingchart-pie3d.min.js
   |   |   |   |-- zingchart-populationpyramid.min.js
   |   |   |   |-- zingchart-preview.min.js
   |   |   |   |-- zingchart-r.min.js
   |   |   |   |-- zingchart-radar.min.js
   |   |   |   |-- zingchart-range.min.js
   |   |   |   |-- zingchart-rankflow.min.js
   |   |   |   |-- zingchart-refresh.min.js
   |   |   |   |-- zingchart-scalemarkers.min.js
   |   |   |   |-- zingchart-scatter.min.js
   |   |   |   |-- zingchart-scroll.min.js
   |   |   |   |-- zingchart-selection-tool.min.js
   |   |   |   |-- zingchart-selection.min.js
   |   |   |   |-- zingchart-stock.min.js
   |   |   |   |-- zingchart-stream.min.js
   |   |   |   |-- zingchart-svg-simple-selection.min.js
   |   |   |   |-- zingchart-toolbar3d.min.js
   |   |   |   |-- zingchart-tooltip.min.js
   |   |   |   |-- zingchart-treemap.min.js
   |   |   |   |-- zingchart-varea.min.js
   |   |   |   |-- zingchart-vbar.min.js
   |   |   |   |-- zingchart-vbar3d.min.js
   |   |   |   |-- zingchart-vbullet.min.js
   |   |   |   |-- zingchart-venn.min.js
   |   |   |   |-- zingchart-vfunnel.min.js
   |   |   |   |-- zingchart-vline.min.js
   |   |   |   |-- zingchart-waterfall.min.js
   |   |   |   |-- zingchart-wordcloud.min.js
   |   |   |   |-- zingchart-xy.min.js
   |   |   |   |-- zingchart-yx.min.js
   |   |   |   |-- zingchart-zoom.min.js
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
