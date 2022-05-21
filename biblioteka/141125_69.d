format 224

classcanvas 128069 class_ref 128325 // Admin
  classdiagramsettings member_max_width 0 end
  xyz 352.8 694.8 2000
end
classcanvas 128197 class_ref 128069 // Bibliotekar
  classdiagramsettings member_max_width 0 end
  xyz 664.7 690.3 2006
end
classcanvas 128453 class_ref 128139 // Clan
  classdiagramsettings member_max_width 0 end
  xyz 364.6 440 2000
end
classcanvas 128581 class_ref 134853 // Knjiga
  classdiagramsettings member_max_width 0 end
  xyz 803.8 427.8 2000
end
classcanvas 128709 class_ref 134981 // Autor
  classdiagramsettings member_max_width 0 end
  xyz 1105.8 406.6 2000
end
classcanvas 129221 class_ref 135109 // Rezervacija
  classdiagramsettings member_max_width 0 end
  xyz 543.3 577.8 2000
end
classcanvas 129861 class_ref 135237 // Izdavanje
  classdiagramsettings member_max_width 0 end
  xyz 524.9 346.8 2000
end
classcanvas 130629 class_ref 141765 // Zanr
  classdiagramsettings member_max_width 0 end
  xyz 863.5 602.4 2000
end
classcanvas 130885 class_ref 141893 // DodavanjeKnjigaForma
  classdiagramsettings member_max_width 0 end
  xyz 1170.3 786.3 2000
end
classcanvas 131013 class_ref 142021 // AutorForma
  classdiagramsettings member_max_width 0 end
  xyz 1397.3 788.3 2000
end
classcanvas 131141 class_ref 142149 // ZanrForma
  classdiagramsettings member_max_width 0 end
  xyz 1012.5 787.4 2000
end
classcanvas 131269 class_ref 142277 // DodavanjeKnjigeKontroler
  classdiagramsettings member_max_width 0 end
  xyz 1149.9 591.3 2000
end
classcanvas 132037 class_ref 142405 // AutorKontroler
  classdiagramsettings member_max_width 0 end
  xyz 1323.3 412.7 2000
end
classcanvas 132165 class_ref 142533 // ZanrKontroler
  classdiagramsettings member_max_width 0 end
  xyz 788.6 699.8 2000
end
classcanvas 132549 class_ref 142661 // NoviAutorForma
  classdiagramsettings member_max_width 0 end
  xyz 1544.9 595.1 2000
end
classcanvas 132677 class_ref 142789 // NoviZanrForma
  classdiagramsettings member_max_width 0 end
  xyz 845.8 807.8 2000
end
classcanvas 134725 class_ref 142917 // KnjigaForma
  classdiagramsettings member_max_width 0 end
  xyz 1125.8 291.8 2000
end
classcanvas 135493 class_ref 143045 // KnjigaKontroler
  classdiagramsettings member_max_width 0 end
  xyz 779.8 299.8 2000
end
classcanvas 135621 class_ref 143173 // DetaljiKnjigeForma
  classdiagramsettings member_max_width 0 end
  xyz 1109.9 175.3 2000
end
classcanvas 135749 class_ref 143301 // IzdavanjeForma
  classdiagramsettings member_max_width 0 end
  xyz 814.9 167.3 2000
end
classcanvas 135877 class_ref 143429 // IzdavanjeKontroler
  classdiagramsettings member_max_width 0 end
  xyz 520.9 175.9 2000
end
classcanvas 137925 class_ref 143557 // ClanForma
  classdiagramsettings member_max_width 0 end
  xyz 821.9 63.3 2000
end
classcanvas 138053 class_ref 143685 // ClanKontroler
  classdiagramsettings member_max_width 0 end
  xyz 293.8 72.9 2000
end
classcanvas 138565 class_ref 143813 // RezervacijaForma
  classdiagramsettings member_max_width 0 end
  xyz 199.9 489 2000
end
classcanvas 138693 class_ref 143941 // DetaljiRezervacijeForma
  classdiagramsettings member_max_width 0 end
  xyz 181.5 375.9 2000
end
classcanvas 138821 class_ref 144069 // IzdavanjeRezervacijeForma
  classdiagramsettings member_max_width 0 end
  xyz 171.2 269.7 2000
end
classcanvas 139205 class_ref 144197 // IzdavanjeRezervacijeKontroler
  classdiagramsettings member_max_width 0 end
  xyz 147.8 163 2000
end
classcanvas 139461 class_ref 144325 // RezervacijaKontroler
  classdiagramsettings member_max_width 0 end
  xyz 105.1 599.4 2000
end
relationcanvas 128325 relation_ref 128069 // <generalisation>
  from ref 128069 z 2007 to ref 128197
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 128965 relation_ref 134725 // <aggregation>
  decenter_begin 163
  from ref 128581 z 2001 to ref 128709
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 129605 relation_ref 135237 // <association>
  decenter_begin 916
  decenter_end 768
  from ref 128453 z 2001 to ref 128581
  no_role_a no_role_b
  multiplicity_a_pos 786 546 3000 multiplicity_b_pos 470 546 3000
end
relationcanvas 130245 relation_ref 135365 // <association>
  decenter_begin 458
  decenter_end 418
  from ref 128453 z 2001 to ref 128581
  no_role_a no_role_b
  multiplicity_a_pos 786 496 3000 multiplicity_b_pos 470 498 3000
end
relationcanvas 130757 relation_ref 141893 // <aggregation>
  decenter_begin 509
  decenter_end 523
  from ref 128581 z 2001 to ref 130629
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 131653 relation_ref 142021 // <association>
  from ref 130885 z 2001 to ref 131013
  no_role_a no_role_b
  multiplicity_a_pos 1367 840 3000 multiplicity_b_pos 1324 838 3000
end
relationcanvas 131781 relation_ref 142149 // <association>
  from ref 130885 z 2001 to ref 131141
  no_role_a no_role_b
  multiplicity_a_pos 1112 838 3000 multiplicity_b_pos 1154 838 3000
end
relationcanvas 131909 relation_ref 142277 // <dependency>
  from ref 130885 z 2001 to ref 131269
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 132805 relation_ref 142661 // <dependency>
  from ref 132677 z 2001 to ref 132165
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 132933 relation_ref 142789 // <dependency>
  from ref 132549 z 2001 to point 1594.5 448.8
  line 135365 z 2001 to ref 132037
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 133061 relation_ref 142917 // <association>
  from ref 131013 z 2001 to point 1594.9 830.3
  line 135237 z 2001 to ref 132549
  no_role_a no_role_b
  multiplicity_a_pos 1565 662 3000 multiplicity_b_pos 1499 838 3000
end
relationcanvas 133189 relation_ref 143045 // <association>
  from ref 131141 z 2001 to ref 132677
  no_role_a no_role_b
  multiplicity_a_pos 952 842 3000 multiplicity_b_pos 994 841 3000
end
relationcanvas 134213 relation_ref 143429 // <dependency>
  from ref 132165 z 2001 to ref 130629
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134341 relation_ref 143557 // <dependency>
  from ref 132037 z 2001 to ref 128709
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134469 relation_ref 143685 // <dependency>
  decenter_end 850
  from ref 131269 z 2001 to point 1241.9 547.9
  line 134597 z 2001 to ref 128581
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134853 relation_ref 143813 // <dependency>
  from ref 131013 z 2001 to ref 132037
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134981 relation_ref 143941 // <dependency>
  decenter_begin 518
  from ref 131141 z 2001 to point 1056.8 736.8
  line 135109 z 2001 to ref 132165
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 136005 relation_ref 144069 // <association>
  from ref 134725 z 2001 to ref 135621
  no_role_a no_role_b
  multiplicity_a_pos 1139 242 3000 multiplicity_b_pos 1152 274 3000
end
relationcanvas 136133 relation_ref 144197 // <association>
  from ref 135621 z 2001 to ref 135749
  no_role_a no_role_b
  multiplicity_a_pos 929 212 3000 multiplicity_b_pos 1091 212 3000
end
relationcanvas 136261 relation_ref 144325 // <dependency>
  from ref 135749 z 2001 to ref 135877
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 136389 relation_ref 144453 // <dependency>
  from ref 134725 z 2001 to ref 135493
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 137413 relation_ref 144837 // <dependency>
  from ref 135493 z 2001 to ref 128581
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 137797 relation_ref 144965 // <dependency>
  from ref 135877 z 2001 to ref 129861
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 138181 relation_ref 145093 // <association>
  from ref 135749 z 2001 to ref 137925
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 138309 relation_ref 145221 // <dependency>
  from ref 137925 z 2001 to ref 138053
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 138437 relation_ref 145349 // <dependency>
  from ref 138053 z 2001 to ref 128453
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 138949 relation_ref 145477 // <association>
  from ref 138565 z 2001 to ref 138693
  no_role_a no_role_b
  multiplicity_a_pos 225 442 3000 multiplicity_b_pos 239 472 3000
end
relationcanvas 139077 relation_ref 145605 // <association>
  from ref 138693 z 2001 to ref 138821
  no_role_a no_role_b
  multiplicity_a_pos 227 336 3000 multiplicity_b_pos 240 356 3000
end
relationcanvas 139333 relation_ref 145733 // <dependency>
  from ref 138821 z 2001 to ref 139205
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 139589 relation_ref 145861 // <association>
  from ref 138565 z 2001 to ref 139461
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 139717 relation_ref 145989 // <dependency>
  from ref 139461 z 2001 to ref 129221
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 139845 relation_ref 146117 // <dependency>
  decenter_end 513
  from ref 139205 z 2001 to point 458 190.4
  line 139973 z 2001 to point 458 404.2
  line 140101 z 2001 to ref 129861
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
line 130117 -_-_
  from ref 129221 z 2002 to ref 129605
line 130501 -_-_
  from ref 129861 z 2002 to ref 130245
end
