format 224

activitynodecanvas 128011 activitynode_ref 134539 // initial_node
  xyz 579.6 19.6 2000
end
activityactioncanvas 128139 activityaction_ref 134539 // activity action Unos podataka o knjizi: ime knjige, broj stranica, povez
  
  show_opaque_action_definition default
  xyzwh 532.8 122.8 2000 115 85
end
activityactioncanvas 128197 activityaction_ref 143813 // activity action Pretraga liste zanrova
  
  show_opaque_action_definition default
  xyzwh 551 853 2000 100 60
end
activityactioncanvas 128395 activityaction_ref 134667 // activity action Provera validnosti podataka
  
  show_opaque_action_definition default
  xyzwh 538 239 2000 105 63
end
activityactioncanvas 128453 activityaction_ref 143941 // activity action Provera da li zanr postoji u sistemu
  
  show_opaque_action_definition default
  xyzwh 552 945 2000 100 60
end
activitynodecanvas 128651 activitynode_ref 134667 // merge
  xyz 576.6 69.4 2005
end
activitynodecanvas 128709 activitynode_ref 143429 // merge
  xyz 588 790 2000
end
activitynodecanvas 128779 activitynode_ref 134795 // decision
  xyz 578 334.4 2000
end
activitynodecanvas 128965 activitynode_ref 143557 // decision
  xyz 587 1046 2000
end
activityactioncanvas 129221 activityaction_ref 144069 // activity action Dodavanje novog zanra
  
  show_opaque_action_definition default
  xyzwh 691 1035 2000 100 60
end
activityactioncanvas 129349 activityaction_ref 144197 // activity action Odabir zanra
  
  show_opaque_action_definition default
  xyzwh 548 1133 2000 100 60
end
activityactioncanvas 129675 activityaction_ref 134795 // activity action Pretraga liste autora
  
  show_opaque_action_definition default
  xyzwh 542.2 455.2 2000 101 61
end
activityactioncanvas 129931 activityaction_ref 134923 // activity action Provera da li autor postoji u sistemu
  
  show_opaque_action_definition default
  xyzwh 543.4 544.8 2000 101 65
end
activitynodecanvas 130443 activitynode_ref 134923 // decision
  xyz 583.1 632.8 2000
end
activityactioncanvas 130699 activityaction_ref 135051 // activity action Dodavanje novog autora
  
  show_opaque_action_definition default
  xyzwh 655.4 618.4 2000 101 61
end
activitynodecanvas 131979 activitynode_ref 135051 // merge
  xyz 578 400.4 2005
end
activityactioncanvas 133387 activityaction_ref 135307 // activity action Odabir autora
  
  show_opaque_action_definition default
  xyzwh 550.2 699.8 2000 95 57
end
activityactioncanvas 133643 activityaction_ref 135435 // activity action Provera da li knjiga vec postoji u sistemu
  
  show_opaque_action_definition default
  xyzwh 540.8 1257.6 2000 119 71
end
activitynodecanvas 133899 activitynode_ref 135179 // decision
  xyz 588.4 1359.6 2000
end
activitynodecanvas 134155 activitynode_ref 135307 // activity_final
  xyz 700.6 1451.2 2000
end
activityactioncanvas 134539 activityaction_ref 135563 // activity action Unos knjige u sistem
  
  show_opaque_action_definition default
  xyzwh 550.4 1432.6 2000 101 61
end
flowcanvas 128523 flow_ref 134667 // <flow>
  
  from ref 128139 z 2001 to ref 128395
   write_horizontally default
end
flowcanvas 128581 flow_ref 141509 // <flow>
  
  from ref 128197 z 2001 to ref 128453
   write_horizontally default
end
flowcanvas 128837 flow_ref 141637 // <flow>
  
  from ref 128709 z 2001 to ref 128197
   write_horizontally default
end
flowcanvas 128907 flow_ref 134795 // <flow>
  
  from ref 128011 z 2006 to ref 128651
   write_horizontally default
end
flowcanvas 129035 flow_ref 134923 // <flow>
  
  from ref 128651 z 2006 to ref 128139
   write_horizontally default
end
flowcanvas 129093 flow_ref 141765 // <flow>
  
  from ref 128453 z 2001 to ref 128965
   write_horizontally default
end
flowcanvas 129163 flow_ref 135051 // <flow>
  
  from ref 128395 z 2001 to ref 128779
   write_horizontally default
end
flowcanvas 129291 flow_ref 135179 // nisu validni
  
  from ref 128779 z 2006 label "nisu validni" xyz 624 326 2006 to point 715 350
  line 129419 z 2006 to point 713 84
  line 129547 z 2006 to ref 128651
   write_horizontally default
end
flowcanvas 129477 flow_ref 141893 // <flow>
  
  from ref 129221 z 2001 to point 737 806
  line 129605 z 2001 to ref 128709
   write_horizontally default
end
flowcanvas 129861 flow_ref 142021 // Ne
  
  from ref 128965 z 2001 label "Ne" xyz 645 1050 3000 to ref 129221
   write_horizontally default
end
flowcanvas 130059 flow_ref 135435 // <flow>
  
  from ref 129675 z 2006 to ref 129931
   write_horizontally default
end
flowcanvas 130117 flow_ref 142149 // Da
  
  from ref 128965 z 2001 label "Da" xyz 600 1097.5 3000 to ref 129349
   write_horizontally default
end
flowcanvas 130245 flow_ref 142277 // <flow>
  
  from ref 133387 z 2001 to ref 128709
   write_horizontally default
end
flowcanvas 130373 flow_ref 142405 // <flow>
  
  from ref 129349 z 2001 to ref 133643
   write_horizontally default
end
flowcanvas 130571 flow_ref 135563 // <flow>
  
  from ref 129931 z 2001 to ref 130443
   write_horizontally default
end
flowcanvas 130827 flow_ref 135691 // ne
  decenter_begin 458
  
  from ref 130443 z 2001 label "ne" xyz 621 629 2001 to ref 130699
   write_horizontally default
end
flowcanvas 132235 flow_ref 136203 // <flow>
  
  from ref 131979 z 2006 to ref 129675
   write_horizontally default
end
flowcanvas 132363 flow_ref 136331 // <flow>
  decenter_end 620
  
  from ref 130699 z 2001 to point 778 646
  line 133131 z 2001 to point 777 418
  line 132747 z 2001 to ref 131979
   write_horizontally default
end
flowcanvas 133003 flow_ref 136459 // validni su
  
  from ref 128779 z 2006 label "validni su" xyz 606 377 2006 to ref 131979
   write_horizontally default
end
flowcanvas 133515 flow_ref 136587 // da
  
  from ref 130443 z 2001 label "da" xyz 608 672 2001 to ref 133387
   write_horizontally default
end
flowcanvas 134027 flow_ref 136843 // <flow>
  
  from ref 133643 z 2001 to ref 133899
   write_horizontally default
end
flowcanvas 134667 flow_ref 137099 // ne postoji
  
  from ref 133899 z 2001 label "ne postoji" xyz 610 1400 2001 to ref 134539
   write_horizontally default
end
flowcanvas 134795 flow_ref 137227 // <flow>
  
  from ref 134539 z 2001 to ref 134155
   write_horizontally default
end
flowcanvas 134923 flow_ref 137355 // postoji
  
  from ref 133899 z 2001 label "postoji" xyz 639 1354 2001 to point 709 1376
  line 135051 z 2001 to ref 134155
   write_horizontally default
end
end
