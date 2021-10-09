import java.awt.*;
public class vlcPlayer extends Frame{
  Menu M1, M2, M3, M4, M5, M6, M7, M8 ,M9;
  MenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m30, m31, m32, m33, m34, m35, m36, m37, m38, m39, m40, m41, m42, m43, m44, m45, m46, m47, m48, m49, m50, m51, m52, m53, m54, m55, m56, m57, m58, m59, m60, m61, m62, m63, m64, m65, m66, m67;
  
public vlcPlayer() {
    MenuBar mb = new MenuBar();
    // Main Menu
    M1 = new Menu("Media");
    M2 = new Menu("PlayBack");
    M3 = new Menu("Audio");
    M4 = new Menu("Video");
    M5 = new Menu("Tools");
    M6 = new Menu("View");
    M7 = new Menu("Help");
    M8 = new Menu("Audio Device");
    M9 =new Menu("Subtitle");


    // Media Item
    m1 = new MenuItem("Open File              Ctrl + o");
    m2 = new MenuItem("advanced open file     Ctrl +shift  + o");
    m3 = new MenuItem("open folder            Ctrl + F");
    m4 = new MenuItem("open disc              Ctrl + D");
    m5 = new MenuItem("Open network stream    Ctrl + N");
    m6 = new MenuItem("open capture device    Ctrl + C");
    m7 = new MenuItem("Open location          Ctrl + V");
    m8 = new MenuItem("recent Media");                
    m9 = new MenuItem("Save playlist to file  ctrl + Y");
    m10 = new MenuItem("convert/save          Ctrl + S");
    m11 = new MenuItem("streaming");                                
    m12 = new MenuItem("Quit                  Ctrl + Q");

    // add item on Media
   	mb.add(M1);
    M1.add(m1);
    M1.add(m2);
    M1.add(m3);
    M1.add(m4);
    M1.add(m5);
    M1.add(m6);
    M1.add(m7);
    M1.add(m8);
    M1.add(m9);
    M1.add(m10);
    M1.add(m11);

    // PlayBack Item
    m13 = new MenuItem("Title");
    m14 = new MenuItem("Chapter");
    m15 = new MenuItem("Program");
    m16 = new MenuItem("Custom Bookmarks");
    m17= new MenuItem("Renderer");
    m18 = new MenuItem("Speed");
    m19= new MenuItem("Jump Forward");
    m20= new MenuItem("Jump Backward");
    m21 = new MenuItem("Jump to Specific Time");
    m22 = new MenuItem("Play");
    m23 = new MenuItem("Stop");
    m24 = new MenuItem("Previous");
    m25 = new MenuItem("Next");
    m26 = new MenuItem("Record");


    // add item on PlayBack
   	mb.add(M2);
    M2.add(m13);
    M2.add(m14);
    M2.add(m15);
    M2.add(m16);
    M2.add(m17);
    M2.add(m18);
    M2.add(m19);
    M2.add(m20);
    M2.add(m21);
    M2.add(m22);
    M2.add(m23);
    M2.add(m2);
    M2.add(m25);
    M2.add(m26);

    // Audio Item
    m27 = new MenuItem("Audio Track   >");
    
      m29 = new MenuItem("Default");
      m30 = new MenuItem("Speaker/Headphone");
    m31= new MenuItem("Stereo Mode");
    m32 = new MenuItem("Visualizations");
    m33= new MenuItem("Increase Volume");
    m34= new MenuItem("IDecrrease Volume");
    m35 = new MenuItem("Mute");

    // add item on Audio
   	mb.add(M3);
    M3.add(m27);
    M3.add(M8);
    M8.add(m29);
    M8.add(m30);
    M3.add(m31);
    M3.add(m32);
    M3.add(m33);
    M3.add(m34);
    M3.add(m35);

     // Video Item
    m36 = new MenuItem("Video Track");
    m37 = new MenuItem("Fullscreen");
    m38 = new MenuItem("Always Fit Windows");
    m39 = new MenuItem("Set As Wallpaper");
    m40= new MenuItem("Zoom");
    m41 = new MenuItem("Aspect Ratio");
    m42= new MenuItem("Crop");
    m43= new MenuItem("Deinterlace");
    m44 = new MenuItem("Deinterlace Mode");
    m45 = new MenuItem("Take Snapshot");

    // add item on Video
   	mb.add(M4);
    M4.add(m36);
    M4.add(m37);
    M4.add(m38);
    M4.add(m39);
    M4.add(m40);
    M4.add(m41);
    M4.add(m42);
    M4.add(m43);
    M4.add(m44);
    M4.add(m45);

    // Media Subtitle
    m46 = new MenuItem("Add Subtitle File ...");
    m47 = new MenuItem("Sub Track");

    // add item on Subtitle
   	mb.add(M9);
    M9.add(m46);
    M9.add(m47);

  // Media Tools
    m48 = new MenuItem("Effects And Filters     Ctrl + E");
    m49 = new MenuItem("Track Synchronization");
    m50 = new MenuItem("Media Information       Ctrl + I");
    m51 = new MenuItem("Codec Information       Ctrl + j");
    m52= new MenuItem("VLM Configuration        Ctrl + + Shift + W");
    m53 = new MenuItem("Program  Guide");
    m54 =new MenuItem("Messages        Ctrl + M");
    m55= new MenuItem("Plugins And extensions");
    m56 = new MenuItem("Customize Interface");
    m57 = new MenuItem("Preferences     Ctrl + P");

  // add item on Tools
   	mb.add(M5);
    M5.add(m48);
    M5.add(m49);
    M5.add(m50);
    M5.add(m51);
    M5.add(m52);
    M5.add(m53);
    M5.add(m54);
    M5.add(m55);
    M5.add(m56);
    M5.add(m57);

  // Media View
    m58 = new MenuItem("Playlist     Ctrl + L");
    m59 = new MenuItem("Docked Playlist");
    m60 = new MenuItem("Always on top");
    m61 = new MenuItem("Minimal Interface");
    m62 = new MenuItem("Fullscreen interface");
    m63 = new MenuItem("Advanced Controls");
    m64 = new MenuItem("Status Bar");

  // add item on View
   	mb.add(M6);
    M6.add(m58);
    M6.add(m59);
    M6.add(m60);
    M6.add(m61);
    M6.add(m62);
    M6.add(m63);
    M6.add(m64);

  // Media Help
    m65 = new MenuItem("Help");
    m66 = new MenuItem("Check For Update");
    m67 = new MenuItem("About");
  // add item on Help
   	mb.add(M7);
    M7.add(m65);
    M7.add(m66);
    M7.add(m67);
	  setMenuBar(mb);
 }
public static void main(String[] args) {
   vlcPlayer v = new vlcPlayer();
   v.setTitle("VLC Player");
   v.setSize(500, 500);
   v.setVisible(true); 
  }
}
