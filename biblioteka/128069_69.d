format 224

usecasecanvas 128011 usecase_ref 128011 // Izmena podataka
  xyzwh 179 68 3005 112 35 label_xy 186 77
end
classcanvas 128069 class_ref 128069 // Bibliotekar
  simpleclassdiagramsettings end
  xyz 441.8 257.14 2000
end
usecasecanvas 128267 usecase_ref 128139 // Brisanje knjige
  xyzwh 260 126 3005 99 34 label_xy 265 131
end
classcanvas 128325 class_ref 128325 // Admin
  simpleclassdiagramsettings end
  xyz 450.82 371.78 2000
end
usecasecanvas 128709 usecase_ref 128069 // Pretraga knjiga
  xyzwh 413 172 3005 109 42 label_xy 420 185
end
usecasecanvas 128907 usecase_ref 128267 // Produzavanje clanarine
  xyzwh 725 253 3005 157 32 label_xy 733 258
end
usecasecanvas 128965 usecase_ref 128197 // Prikaz detalja knjige
  xyzwh 399 91 3005 132 37 label_xy 409 100
end
usecasecanvas 129035 usecase_ref 128395 // Izdavanje opomene
  xyzwh 56 387 3005 153 37 label_xy 71 397
end
usecasecanvas 129675 usecase_ref 128523 // Dodavanje knjige
  xyzwh 199 229 3005 124 33 label_xy 219 237
end
usecasecanvas 130315 usecase_ref 128453 // Dodavanje clana
  xyzwh 598 376 3005 118 33 label_xy 605 381
end
usecasecanvas 130373 usecase_ref 128581 // Brisanje clana
  xyzwh 750 188 3005 98 34 label_xy 755 195
end
usecasecanvas 130629 usecase_ref 128709 // Pretraga clanova
  xyzwh 673 304 3005 119 34 label_xy 682 312
end
usecasecanvas 130757 usecase_ref 128837 // Odabir clana
  xyzwh 536 228 3005 88 32 label_xy 540 235
end
usecasecanvas 130955 usecase_ref 128779 // Izdavanje knjige
  xyzwh 633 134 3005 115 33 label_xy 641 140
end
usecasecanvas 131467 usecase_ref 128907 // Prikaz izdatih knjiga
  xyzwh 272 367 3005 131 33 label_xy 274 373
end
usecasecanvas 131723 usecase_ref 129035 // Odabir izdavanja
  xyzwh 129 467 3005 114 33 label_xy 134 474
end
usecasecanvas 131979 usecase_ref 129163 // Produzavanje roka
  xyzwh 89 541 3005 122 33 label_xy 96 549
end
usecasecanvas 132293 usecase_ref 129093 // prikaz bibliotekara
  xyzwh 417 508 3005 121 33 label_xy 422 514
end
usecasecanvas 132363 usecase_ref 129291 // Prikaz rezervisanih knjiga
  xyzwh 509 443 3005 189 35 label_xy 528 450
end
usecasecanvas 132549 usecase_ref 129221 // pretraga bibliotekara
  xyzwh 283 577 3005 136 33 label_xy 290 582
end
usecasecanvas 132619 usecase_ref 129419 // Odabir rezervacije
  xyzwh 589 546 3005 132 33 label_xy 595 554
end
usecasecanvas 132677 usecase_ref 129349 // odabir bibliotekara
  xyzwh 325 672 3005 121 33 label_xy 336 680
end
usecasecanvas 132805 usecase_ref 129477 // brisanje bibliotekara
  xyzwh 456 607 3005 130 32 label_xy 462 615
end
usecasecanvas 132933 usecase_ref 129605 // dodavanje bibliotekara
  xyzwh 272 463 3005 144 32 label_xy 275 470
end
usecasecanvas 134469 usecase_ref 136133 // Izdavanje rezervisane knjige
  xyzwh 724 462 3005 191 49 label_xy 733 479
end
usecasecanvas 134725 usecase_ref 142661 // dodavanjeZanra
  xyzwh 222 295 3005 103 45 label_xy 235 309
end
usecasecanvas 134923 usecase_ref 135947 // Dodavanje autora
  xyzwh 204 168 3005 122 32 label_xy 219 175
end
usecasecanvas 134981 usecase_ref 142789 // pretragaZanra
  xyzwh 10 240 3005 95 37 label_xy 20 249
end
usecasecanvas 135109 usecase_ref 142917 // odabirZanra
  xyzwh 41 317 3011 87 37 label_xy 55 327
end
usecasecanvas 135563 usecase_ref 136075 // Pretraga autora
  xyzwh 35 142 3005 110 32 label_xy 40 148
end
usecasecanvas 135819 usecase_ref 136203 // Odabir autora
  xyzwh 34 55 3005 100 33 label_xy 41 62
end
simplerelationcanvas 128139 simplerelation_ref 128011
  decenter_end 381
  from ref 128011 z 3006 stereotype "<<extend>>" xyz 311 97 3000 to ref 128965
end
simplerelationcanvas 128395 simplerelation_ref 128139
  from ref 128267 z 3006 stereotype "<<extend>>" xyz 345 123 3000 to ref 128965
end
relationcanvas 128453 relation_ref 128069 // <generalisation>
  from ref 128325 z 2001 to ref 128069
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
line 128779 ----
  from ref 128069 z 3006 to ref 130757
simplerelationcanvas 129477 simplerelation_ref 128069
  from ref 128965 z 3006 stereotype "<<extend>>" xyz 431 150 3000 to ref 128709
end
line 129803 ----
  from ref 128325 z 3006 to ref 132933
line 129989 ----
  from ref 128069 z 3006 to ref 128709
line 130443 ----
  from ref 128069 z 3006 to ref 130315
line 130571 ---- decenter_end 722
  from ref 128069 z 3011 to ref 129675
simplerelationcanvas 131083 simplerelation_ref 128779
  decenter_end 930
  from ref 130955 z 3006 stereotype "<<extend>>" xyz 548 130 3000 to ref 128965
end
line 131595 ----
  from ref 128069 z 3006 to ref 131467
simplerelationcanvas 131851 simplerelation_ref 129035
  from ref 131723 z 3006 stereotype "<<extend>>" xyz 222 432 3000 to ref 131467
end
simplerelationcanvas 132107 simplerelation_ref 129163
  from ref 129035 z 3006 stereotype "<<extend>>" xyz 122 445 3000 to ref 131723
end
simplerelationcanvas 132235 simplerelation_ref 129291
  from ref 131979 z 3006 stereotype "<<extend>>" xyz 126 520 3000 to ref 131723
end
line 132421 ----
  from ref 128325 z 3006 to ref 132293
line 132491 ----
  from ref 128069 z 3006 to ref 132363
simplerelationcanvas 133003 simplerelation_ref 129547
  decenter_begin 587
  from ref 132619 z 3006 stereotype "<<extend>>" xyz 604 510 3000 to ref 132363
end
simplerelationcanvas 133189 simplerelation_ref 129221
  from ref 132549 z 3006 stereotype "<<extend>>" xyz 377 526 3000 to ref 132293
end
simplerelationcanvas 133317 simplerelation_ref 129349
  decenter_begin 532
  from ref 132549 z 3006 stereotype "<<include>>" xyz 336 639 3000 to ref 132677
end
simplerelationcanvas 133387 simplerelation_ref 129675
  from ref 130757 z 3006 stereotype "<<include>>" xyz 617 279 3000 to ref 130629
end
simplerelationcanvas 133445 simplerelation_ref 129477
  from ref 132805 z 3006 stereotype "<<extend>>" xyz 423 568 3000 to ref 132293
end
simplerelationcanvas 133515 simplerelation_ref 129803
  from ref 130955 z 3006 stereotype "<<include>>" xyz 565 178 3000 to ref 130757
end
simplerelationcanvas 133643 simplerelation_ref 129931
  from ref 128907 z 3006 stereotype "<<extend>>" xyz 638 252 3000 to ref 130757
end
simplerelationcanvas 134597 simplerelation_ref 136389
  from ref 134469 z 3006 stereotype "<<extend>>" xyz 687 527 3000 to ref 132619
end
simplerelationcanvas 134667 simplerelation_ref 130059
  from ref 130373 z 3006 stereotype "<<extend>>" xyz 650 221 3000 to ref 130757
end
line 134853 ----
  from ref 128069 z 3006 to ref 134725
simplerelationcanvas 135237 simplerelation_ref 142917
  from ref 134981 z 3006 stereotype "<<extend>>" xyz 117 251 3000 to ref 129675
end
simplerelationcanvas 135365 simplerelation_ref 143045
  from ref 135109 z 3012 stereotype "<<extend>>" xyz 35 290 3000 to ref 134981
end
simplerelationcanvas 135493 simplerelation_ref 143173
  from ref 134725 z 3006 stereotype "<<extend>>" xyz 129 286 3000 to ref 134981
end
simplerelationcanvas 135691 simplerelation_ref 136587
  from ref 135563 z 3006 stereotype "<<extend>>" xyz 137 200 3000 to ref 129675
end
simplerelationcanvas 135947 simplerelation_ref 136715
  from ref 135819 z 3006 stereotype "<<extend>>" xyz 47 114 3000 to ref 135563
end
simplerelationcanvas 136075 simplerelation_ref 136843
  from ref 134923 z 3006 stereotype "<<extend>>" xyz 136 167 3000 to ref 135563
end
line 136203 ----
  from ref 128069 z 3006 to ref 134923
simplerelationcanvas 136331 simplerelation_ref 136971
  from ref 130315 z 3006 stereotype "<<extend>>" xyz 654 356 3000 to ref 130629
end
simplerelationcanvas 136459 simplerelation_ref 137099
  from ref 129675 z 3006 stereotype "<<extend>>" xyz 328 215 3000 to ref 128709
end
simplerelationcanvas 136587 simplerelation_ref 137227
  from ref 132933 z 3006 stereotype "<<extend>>" xyz 309 535 3000 to ref 132549
end
end
