package APCompSci.Assignments.Assign9;
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *      FILE:       StringPracticeFrame.java
 *      DATE:       8/2013 Original
 *      AUTHOR:     mr Hanley
 *      VERSION:    3.0
 *      PURPOSE:    GUI for String Practice.  It's sick.  In a good way, yep!
 *                  Contains methods that the GUI will use to operate
 *                  12/15/2020: Changed the image loading to use ImageIO.read
 *                  instead of loading from the ClassLoader
 *                  2/25/2021:  Changed image loading again so it would work
 *                              with a jar file if needed
 *                  1/5/2022:   Updated with a checkbox for password checker
 *                  1/24/2022:  Got rid of adding http for the title and links enter site button
 *                  2/6/2022:   Added 2 websites that are not likely to change
 *                              I extended the Level1 and Level2 labels
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class StringPractFrame_Old extends javax.swing.JFrame implements ActionListener {
    //----------------------------------------------------------------
    //---------------- I N S T A N C E  V A R I A B L E S ------------
    //----------------------------------------------------------------

    Font fo = new Font("Arial Unicode MS", Font.BOLD, 32);
    JButton[] exitBUTs = new JButton[6];
    StringMethods sm = new StringMethods();
    //Change to using a different image loader
    ImageIcon sadIcon;
    ImageIcon happyIcon;
    AboutFrame af = new AboutFrame();
    /**
     * Creates new form StringPractFrame
     */
    public StringPractFrame_Old() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StringPractFrame_Old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringPractFrame_Old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringPractFrame_Old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringPractFrame_Old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        setupTitles();
        setupCoolExitButtons();
        addToTitleComboBox();
        addToLinksComboBox();
        //Added 12/15/2020 -> Loading Images without using the Class Loader
        //Inside Constructor, to load in the images from the /images folder
        try {
             InputStream instr = getClass().getClassLoader().
                    getResourceAsStream("images/thumbsdown.jpg");
             InputStream instr2 = getClass().getClassLoader().
                    getResourceAsStream("images/thumbsup.jpg");
             
            sadIcon = new ImageIcon(ImageIO.read(instr));
            happyIcon = new ImageIcon(ImageIO.read(instr2));

        } catch (IOException e) {
            e.printStackTrace();
        }
        af.setBounds(200, 100, 850, 600);
    }

    public void setupTitles() {
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup Pascals Triangle
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        String tempTitle = "Pascals Triangle", newTitle = "";
        for (int i = 0; i < tempTitle.length(); i++) {
            if (!tempTitle.substring(i, i + 1).equals(" ")) {
                newTitle += tempTitle.substring(i, i + 1) + "\u25ED";
            } else {
                newTitle += tempTitle.substring(i, i + 1);
            }
        }
        mainTP.setTitleAt(0, newTitle);
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup Music
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        tempTitle = "\u266B \u266A Music \u266d \u2669";
        newTitle = "";
        mainTP.setTitleAt(1, tempTitle);
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup Password
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        tempTitle = "\u2622Password\u2654";
        mainTP.setTitleAt(2, tempTitle);
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup CompareTo
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        tempTitle = "\u226ACompare\u226B";
        mainTP.setTitleAt(3, tempTitle);
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup Title
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        tempTitle = "\u2605Title\u2605";
        mainTP.setTitleAt(4, tempTitle);
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //  Setup Links
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        tempTitle = "\u21A9Web Links\u2207";
        mainTP.setTitleAt(5, tempTitle);
    }

    public void setupCoolExitButtons() {
        Color[] butCols = {Color.MAGENTA,
            Color.ORANGE, new Color(11, 180, 2),
            new Color(130, 100, 20),
            new Color(127, 100, 0),
            new Color(100, 40, 100),
            new Color(160, 20, 42)};

        for (int i = 0; i < exitBUTs.length; i++) {
            exitBUTs[i] = new JButton("E   *   x   *   i   *   t");
            exitBUTs[i].setBounds(new Rectangle(0, 780, 1700, 37));
            exitBUTs[i].setFont(fo);
            exitBUTs[i].addActionListener(this);
            exitBUTs[i].setBackground(butCols[i]);
        }
        pascalPAN.add(exitBUTs[0]);
        linksPAN.add(exitBUTs[1]);
        titlePAN.add(exitBUTs[2]);
        musicPAN.add(exitBUTs[3]);
        comparePAN.add(exitBUTs[4]);
        passwdPAN.add(exitBUTs[5]);
    }

    @SuppressWarnings("unchecked")
    public void addToTitleComboBox() {
        //Add some URL's to the ComboBox
        siteCB.addItem("https://www.internetsociety.org/");
        siteCB.addItem("https://www.internetsociety.org/internet/history-internet/");
        siteCB.addItem("https://www.digitaltrends.com/gaming/the-history-of-the-xbox/");
        siteCB.addItem("http://www.google.com");
        siteCB.addItem("https://cs.union.edu/~rieffelj/");
        siteCB.addItem("https://www.union.edu/english/faculty-staff/kara-doyle");
        siteCB.addItem("https://www.union.edu/english/faculty-staff/andrew-burkett");
        siteCB.addItem("https://sites.google.com/a/shenschools.org/mr-desario/");
        siteCB.addItem("https://racketlounge.com/history-of-tennis/");
    }

    @SuppressWarnings("unchecked")
    public void addToLinksComboBox() {
        //Add some URL's to the ComboBox
        siteLinksCB.addItem("https://www.internetsociety.org/");
        siteLinksCB.addItem("https://www.internetsociety.org/internet/history-internet/");
        siteLinksCB.addItem("https://www.digitaltrends.com/gaming/the-history-of-the-xbox/");
        siteLinksCB.addItem("http://www.google.com");
        siteLinksCB.addItem("https://cs.union.edu/~rieffelj/");
        siteLinksCB.addItem("https://www.union.edu/english/faculty-staff/kara-doyle");
        siteLinksCB.addItem("https://www.union.edu/english/faculty-staff/andrew-burkett");
        siteLinksCB.addItem("https://sites.google.com/a/shenschools.org/mr-desario/");
        siteLinksCB.addItem("https://racketlounge.com/history-of-tennis/");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < exitBUTs.length; i++) {
            if (e.getSource() == exitBUTs[i]) {
                System.exit(0);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightBUT = new javax.swing.JButton();
        levelBG = new javax.swing.ButtonGroup();
        mainTP = new javax.swing.JTabbedPane();
        pascalPAN = new javax.swing.JPanel();
        pasSizeTF = new javax.swing.JTextField();
        pasBUT = new javax.swing.JButton();
        pasSP = new javax.swing.JScrollPane();
        pasTA = new javax.swing.JTextArea();
        musicPAN = new javax.swing.JPanel();
        songTF = new javax.swing.JTextField();
        numwordsTF = new javax.swing.JTextField();
        songLBL = new javax.swing.JLabel();
        numwordsLBL = new javax.swing.JLabel();
        numwordsBUT = new javax.swing.JButton();
        passwdPAN = new javax.swing.JPanel();
        enterpaBUT = new javax.swing.JButton();
        pwTF = new javax.swing.JPasswordField();
        pwLBL = new javax.swing.JLabel();
        passwordRequireLBL = new javax.swing.JLabel();
        resultLBL = new javax.swing.JLabel();
        level1RB = new javax.swing.JRadioButton();
        level2RB = new javax.swing.JRadioButton();
        comparePAN = new javax.swing.JPanel();
        firstWordTF = new javax.swing.JTextField();
        secondWordTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        ctLBL = new javax.swing.JLabel();
        compareBUT = new javax.swing.JButton();
        titlePAN = new javax.swing.JPanel();
        urlLBL = new javax.swing.JLabel();
        siteCB = new javax.swing.JComboBox();
        titleTF = new javax.swing.JTextField();
        statusTF = new javax.swing.JTextField();
        htmlSP = new javax.swing.JScrollPane();
        htmlTP = new javax.swing.JTextPane();
        statusLBL = new javax.swing.JLabel();
        titleSiteLBL = new javax.swing.JLabel();
        sourceLBL = new javax.swing.JLabel();
        openBUT = new javax.swing.JButton();
        enterBUT = new javax.swing.JButton();
        linksPAN = new javax.swing.JPanel();
        openLinksBUT = new javax.swing.JButton();
        enterLinksBUT = new javax.swing.JButton();
        urlLinksLBL = new javax.swing.JLabel();
        siteLinksCB = new javax.swing.JComboBox();
        linksLBL = new javax.swing.JLabel();
        linkStatusTF = new javax.swing.JTextField();
        numLinksLBL = new javax.swing.JLabel();
        numLinksTF = new javax.swing.JTextField();
        sourceLBL1 = new javax.swing.JLabel();
        htmlSP1 = new javax.swing.JScrollPane();
        htmlLinksTP = new javax.swing.JTextPane();
        statusLBL2 = new javax.swing.JLabel();
        linksSP = new javax.swing.JScrollPane();
        linksTA = new javax.swing.JTextArea();
        titleLBL = new javax.swing.JLabel();
        leftBUT = new javax.swing.JButton();
        rtBUT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainTP.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        mainTP.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        pascalPAN.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        pascalPAN.setLayout(null);

        pasSizeTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        pasSizeTF.setText("6");
        pasSizeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasSizeTFActionPerformed(evt);
            }
        });
        pascalPAN.add(pasSizeTF);
        pasSizeTF.setBounds(460, 10, 80, 30);

        pasBUT.setBackground(new java.awt.Color(255, 255, 51));
        pasBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        pasBUT.setText("Draw It!");
        pasBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasBUTActionPerformed(evt);
            }
        });
        pascalPAN.add(pasBUT);
        pasBUT.setBounds(330, 10, 120, 30);

        pasTA.setBackground(new java.awt.Color(0, 0, 0));
        pasTA.setColumns(20);
        pasTA.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        pasTA.setForeground(new java.awt.Color(255, 255, 255));
        pasTA.setRows(5);
        pasSP.setViewportView(pasTA);

        pascalPAN.add(pasSP);
        pasSP.setBounds(10, 50, 1470, 730);

        mainTP.addTab("P*a*s*c*a*l*s*T*r*i*a*n*g*l*e", pascalPAN);

        musicPAN.setLayout(null);

        songTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        musicPAN.add(songTF);
        songTF.setBounds(190, 90, 670, 30);

        numwordsTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        musicPAN.add(numwordsTF);
        numwordsTF.setBounds(190, 190, 80, 30);

        songLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        songLBL.setText("Enter Song Name");
        musicPAN.add(songLBL);
        songLBL.setBounds(190, 70, 160, 14);

        numwordsLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        numwordsLBL.setText("Number Words");
        musicPAN.add(numwordsLBL);
        numwordsLBL.setBounds(190, 170, 160, 14);

        numwordsBUT.setBackground(new java.awt.Color(255, 255, 51));
        numwordsBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        numwordsBUT.setText("Count Words");
        numwordsBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numwordsBUTActionPerformed(evt);
            }
        });
        musicPAN.add(numwordsBUT);
        numwordsBUT.setBounds(190, 130, 140, 30);

        mainTP.addTab("Music", musicPAN);

        passwdPAN.setLayout(null);

        enterpaBUT.setBackground(new java.awt.Color(255, 255, 51));
        enterpaBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        enterpaBUT.setText("Enter Password");
        enterpaBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpaBUTActionPerformed(evt);
            }
        });
        passwdPAN.add(enterpaBUT);
        enterpaBUT.setBounds(200, 120, 170, 30);

        pwTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        pwTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwtfFocusGained(evt);
            }
        });
        passwdPAN.add(pwTF);
        pwTF.setBounds(200, 70, 190, 30);

        pwLBL.setFont(enterBUT.getFont());
        pwLBL.setText("Enter PassWord");
        passwdPAN.add(pwLBL);
        pwLBL.setBounds(200, 50, 160, 14);

        passwordRequireLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        passwordRequireLBL.setText("Password must be >= 6 symbols and at least one non-letter");
        passwdPAN.add(passwordRequireLBL);
        passwordRequireLBL.setBounds(200, 0, 750, 40);
        passwdPAN.add(resultLBL);
        resultLBL.setBounds(200, 180, 232, 217);

        levelBG.add(level1RB);
        level1RB.setFont(enterBUT.getFont());
        level1RB.setSelected(true);
        level1RB.setText("Level 1");
        level1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1RBActionPerformed(evt);
            }
        });
        passwdPAN.add(level1RB);
        level1RB.setBounds(440, 60, 110, 27);

        levelBG.add(level2RB);
        level2RB.setFont(compareBUT.getFont());
        level2RB.setText("Level 2");
        level2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2RBActionPerformed(evt);
            }
        });
        passwdPAN.add(level2RB);
        level2RB.setBounds(440, 100, 80, 27);

        mainTP.addTab("Password", passwdPAN);

        comparePAN.setLayout(null);

        firstWordTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        firstWordTF.setText("A");
        comparePAN.add(firstWordTF);
        firstWordTF.setBounds(270, 160, 260, 30);

        secondWordTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        secondWordTF.setText("B");
        comparePAN.add(secondWordTF);
        secondWordTF.setBounds(270, 240, 260, 30);

        resultTF.setEditable(false);
        resultTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        comparePAN.add(resultTF);
        resultTF.setBounds(270, 320, 80, 30);

        ctLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        ctLBL.setText("compareTo");
        comparePAN.add(ctLBL);
        ctLBL.setBounds(310, 210, 160, 14);

        compareBUT.setBackground(new java.awt.Color(255, 255, 51));
        compareBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        compareBUT.setText("compareTo");
        compareBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareBUTActionPerformed(evt);
            }
        });
        comparePAN.add(compareBUT);
        compareBUT.setBounds(270, 380, 120, 30);

        mainTP.addTab("Compare To", comparePAN);

        titlePAN.setLayout(null);

        urlLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        urlLBL.setText("URL");
        titlePAN.add(urlLBL);
        urlLBL.setBounds(20, 70, 160, 10);

        siteCB.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        titlePAN.add(siteCB);
        siteCB.setBounds(20, 90, 1460, 20);

        titleTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        titlePAN.add(titleTF);
        titleTF.setBounds(20, 180, 1460, 30);

        statusTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        titlePAN.add(statusTF);
        statusTF.setBounds(20, 130, 1460, 30);

        htmlTP.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        htmlSP.setViewportView(htmlTP);

        titlePAN.add(htmlSP);
        htmlSP.setBounds(180, 140, 1460, 550);

        statusLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        statusLBL.setText("Status");
        titlePAN.add(statusLBL);
        statusLBL.setBounds(20, 110, 160, 14);

        titleSiteLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        titleSiteLBL.setText("HTML Title");
        titlePAN.add(titleSiteLBL);
        titleSiteLBL.setBounds(20, 160, 160, 14);

        sourceLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        sourceLBL.setText("Page Source");
        titlePAN.add(sourceLBL);
        sourceLBL.setBounds(20, 210, 160, 17);

        openBUT.setBackground(new java.awt.Color(255, 255, 51));
        openBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        openBUT.setText("Open Site");
        openBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBUTActionPerformed(evt);
            }
        });
        titlePAN.add(openBUT);
        openBUT.setBounds(260, 20, 120, 30);

        enterBUT.setBackground(new java.awt.Color(255, 255, 51));
        enterBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        enterBUT.setText("Enter Site");
        enterBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBUTActionPerformed(evt);
            }
        });
        titlePAN.add(enterBUT);
        enterBUT.setBounds(400, 20, 120, 30);

        mainTP.addTab("Title", titlePAN);

        linksPAN.setLayout(null);

        openLinksBUT.setBackground(new java.awt.Color(255, 51, 51));
        openLinksBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        openLinksBUT.setText("Open Site");
        openLinksBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLinksBUTActionPerformed(evt);
            }
        });
        linksPAN.add(openLinksBUT);
        openLinksBUT.setBounds(260, 20, 120, 30);

        enterLinksBUT.setBackground(new java.awt.Color(255, 51, 51));
        enterLinksBUT.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        enterLinksBUT.setText("Enter Site");
        enterLinksBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterLinksBUTActionPerformed(evt);
            }
        });
        linksPAN.add(enterLinksBUT);
        enterLinksBUT.setBounds(400, 20, 120, 30);

        urlLinksLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        urlLinksLBL.setText("URL");
        linksPAN.add(urlLinksLBL);
        urlLinksLBL.setBounds(20, 70, 160, 10);

        siteLinksCB.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linksPAN.add(siteLinksCB);
        siteLinksCB.setBounds(20, 90, 1460, 20);

        linksLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        linksLBL.setText("Links");
        linksPAN.add(linksLBL);
        linksLBL.setBounds(20, 160, 160, 14);

        linkStatusTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linksPAN.add(linkStatusTF);
        linkStatusTF.setBounds(20, 130, 180, 30);

        numLinksLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        numLinksLBL.setText("# HyperlInks");
        linksPAN.add(numLinksLBL);
        numLinksLBL.setBounds(220, 110, 160, 14);

        numLinksTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linksPAN.add(numLinksTF);
        numLinksTF.setBounds(220, 130, 100, 30);

        sourceLBL1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        sourceLBL1.setText("Page Source");
        linksPAN.add(sourceLBL1);
        sourceLBL1.setBounds(20, 340, 160, 17);

        htmlLinksTP.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        htmlSP1.setViewportView(htmlLinksTP);

        linksPAN.add(htmlSP1);
        htmlSP1.setBounds(20, 360, 1460, 430);

        statusLBL2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        statusLBL2.setText("Status");
        linksPAN.add(statusLBL2);
        statusLBL2.setBounds(20, 110, 160, 14);

        linksTA.setColumns(20);
        linksTA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linksTA.setRows(5);
        linksSP.setViewportView(linksTA);

        linksPAN.add(linksSP);
        linksSP.setBounds(20, 180, 1460, 150);

        mainTP.addTab("Links", linksPAN);

        getContentPane().add(mainTP);
        mainTP.setBounds(0, 70, 1700, 860);

        titleLBL.setFont(new java.awt.Font("Arial Unicode MS", 1, 48)); // NOI18N
        titleLBL.setText("String Practice by mr Hanley 12/11/2021");
        getContentPane().add(titleLBL);
        titleLBL.setBounds(280, 0, 970, 80);

        leftBUT.setIcon(new javax.swing.ImageIcon("C:\\Users\\mrhan\\Google Drive\\____Code\\JavaProjects\\APCS - 36\\Topics  33\\Strings - 6\\StringPracticeSkeleton_NB\\build\\classes\\images\\horseleft.png")); // NOI18N
        leftBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBUTActionPerformed(evt);
            }
        });
        getContentPane().add(leftBUT);
        leftBUT.setBounds(10, 0, 70, 70);

        rtBUT.setIcon(new javax.swing.ImageIcon("C:\\Users\\mrhan\\Google Drive\\____Code\\JavaProjects\\APCS - 36\\Topics  33\\Strings - 6\\StringPracticeSkeleton_NB\\build\\classes\\images\\horseright.png")); // NOI18N
        rtBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtBUTActionPerformed(evt);
            }
        });
        getContentPane().add(rtBUT);
        rtBUT.setBounds(1410, 0, 70, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasBUTActionPerformed
        int num = Integer.parseInt(pasSizeTF.getText());

        //int numdigits = 
        if (num < 3 || num > 100) {
            JOptionPane.showMessageDialog(null, "Out of Range", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String triangle = sm.pascalsTri(num);

            pasTA.setText(triangle);
        }
    }//GEN-LAST:event_pasBUTActionPerformed

    private void pasSizeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasSizeTFActionPerformed
    }//GEN-LAST:event_pasSizeTFActionPerformed

    private void openBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBUTActionPerformed
        //Grab the web site we are trying to open
        int which = siteCB.getSelectedIndex();
        //Now grab the string
        String url = (String) siteCB.getItemAt(which);
        String text = null;
        try {
            text = sm.openURL(url);
            statusTF.setText("Connected");
        } catch (Exception ex) {
            statusTF.setText(ex.toString());
        }
        String title = sm.findTitle(text);
        titleTF.setText(title);
        htmlTP.setText(text);
        htmlTP.setCaretPosition(0);
    }//GEN-LAST:event_openBUTActionPerformed

    @SuppressWarnings("unchecked")
    private void enterBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBUTActionPerformed
        String newSite = JOptionPane.showInputDialog(null,
                "Please enter in site, with http");
        if (newSite != null) {
            siteCB.addItem(newSite);
            siteCB.setSelectedIndex(siteCB.getItemCount() - 1);
        }
    }//GEN-LAST:event_enterBUTActionPerformed

    private void openLinksBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLinksBUTActionPerformed
        /**
         * ***************************************************************
         * # 4
         * G E T L I N K S S T U F F
         *
         ****************************************************************
         */
        //Grab the web site we are trying to open
        int which = siteLinksCB.getSelectedIndex();
        //Now grab the string
        String url = (String) siteLinksCB.getItemAt(which);
        String text = null;
        try {
            text = sm.openURL(url);
            linkStatusTF.setText("Connected");
        } catch (Exception ex) {
            linkStatusTF.setText(ex.toString());
        }
        String[] links = sm.findLinks(text);
        //Set the number on the for the linksTF
        numLinksTF.setText(links.length + "");
        //Clear the old links
        linksTA.setText("");
        for (String elem : links) {
            linksTA.append(elem + "\n");
        }
        htmlLinksTP.setText(text);
        htmlLinksTP.setCaretPosition(0);
        linksTA.setCaretPosition(0);
    }//GEN-LAST:event_openLinksBUTActionPerformed

    @SuppressWarnings("unchecked")
    private void enterLinksBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterLinksBUTActionPerformed
        String newSite = JOptionPane.showInputDialog(null,
                "Please enter in site with http:// or https://");
        if (newSite != null) {
            siteLinksCB.addItem(newSite);
            siteLinksCB.setSelectedIndex(siteLinksCB.getItemCount() - 1);
        }
    }//GEN-LAST:event_enterLinksBUTActionPerformed

    private void numwordsBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numwordsBUTActionPerformed
        String songText = songTF.getText();
        if (songText.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Empty Song", "ERROR!",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int count = sm.numWords(songText);
            numwordsTF.setText(count + "");
        }

    }//GEN-LAST:event_numwordsBUTActionPerformed

    private void enterpaBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpaBUTActionPerformed
        char[] pw = pwTF.getPassword();
        String trimmedPW = new String(pw).trim();
        int lvl = 1;
        
        if(level2RB.isSelected()){
            lvl=2;
        }
        if (sm.passwordVerify(trimmedPW,lvl)) {
            resultLBL.setIcon(happyIcon);
        } else
            resultLBL.setIcon(sadIcon);
    }//GEN-LAST:event_enterpaBUTActionPerformed

    private void leftBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBUTActionPerformed
        af.setVisible(true);
    }//GEN-LAST:event_leftBUTActionPerformed

    private void rtBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtBUTActionPerformed
        af.setVisible(true);
    }//GEN-LAST:event_rtBUTActionPerformed

    private void pwtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwtfFocusGained
        resultLBL.setIcon(null);
    }//GEN-LAST:event_pwtfFocusGained

    private void compareBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareBUTActionPerformed
      
    }//GEN-LAST:event_compareBUTActionPerformed

    private void level1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1RBActionPerformed
        passwordRequireLBL.setText("Password must be >= 6 symbols and at least one non-letter");
    }//GEN-LAST:event_level1RBActionPerformed

    private void level2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2RBActionPerformed
        passwordRequireLBL.setText("Password must be >= 8 symbols and at least one non-letter, one uppercase and one digit");
    }//GEN-LAST:event_level2RBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compareBUT;
    private javax.swing.JPanel comparePAN;
    private javax.swing.JLabel ctLBL;
    private javax.swing.JButton enterBUT;
    private javax.swing.JButton enterLinksBUT;
    private javax.swing.JButton enterpaBUT;
    private javax.swing.JTextField firstWordTF;
    private javax.swing.JTextPane htmlLinksTP;
    private javax.swing.JScrollPane htmlSP;
    private javax.swing.JScrollPane htmlSP1;
    private javax.swing.JTextPane htmlTP;
    private javax.swing.JButton leftBUT;
    private javax.swing.JRadioButton level1RB;
    private javax.swing.JRadioButton level2RB;
    private javax.swing.ButtonGroup levelBG;
    private javax.swing.JTextField linkStatusTF;
    private javax.swing.JLabel linksLBL;
    private javax.swing.JPanel linksPAN;
    private javax.swing.JScrollPane linksSP;
    private javax.swing.JTextArea linksTA;
    private javax.swing.JTabbedPane mainTP;
    private javax.swing.JPanel musicPAN;
    private javax.swing.JLabel numLinksLBL;
    private javax.swing.JTextField numLinksTF;
    private javax.swing.JButton numwordsBUT;
    private javax.swing.JLabel numwordsLBL;
    private javax.swing.JTextField numwordsTF;
    private javax.swing.JButton openBUT;
    private javax.swing.JButton openLinksBUT;
    private javax.swing.JButton pasBUT;
    private javax.swing.JScrollPane pasSP;
    private javax.swing.JTextField pasSizeTF;
    private javax.swing.JTextArea pasTA;
    private javax.swing.JPanel pascalPAN;
    private javax.swing.JPanel passwdPAN;
    private javax.swing.JLabel passwordRequireLBL;
    private javax.swing.JLabel pwLBL;
    private javax.swing.JPasswordField pwTF;
    private javax.swing.JLabel resultLBL;
    private javax.swing.JTextField resultTF;
    @SuppressWarnings("unused")
    private javax.swing.JButton rightBUT;
    private javax.swing.JButton rtBUT;
    private javax.swing.JTextField secondWordTF;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox siteCB;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox siteLinksCB;
    private javax.swing.JLabel songLBL;
    private javax.swing.JTextField songTF;
    private javax.swing.JLabel sourceLBL;
    private javax.swing.JLabel sourceLBL1;
    private javax.swing.JLabel statusLBL;
    private javax.swing.JLabel statusLBL2;
    private javax.swing.JTextField statusTF;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JPanel titlePAN;
    private javax.swing.JLabel titleSiteLBL;
    private javax.swing.JTextField titleTF;
    private javax.swing.JLabel urlLBL;
    private javax.swing.JLabel urlLinksLBL;
    // End of variables declaration//GEN-END:variables
}
