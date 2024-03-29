/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

import java.util.ArrayList;

public class JatekArena extends javax.swing.JFrame {
    
    String[] szovegLista = {
        "Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. Ha inkább tovább haladsz észak felé, lapozz a 66-ra.",
        "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. Ha ketté akarod vágni a kardoddal, lapozz a 215-re.",
        "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.",
        "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.",
        "Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.",
        "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé. Lapozz a 66-ra.",
        "A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re. Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.",
        "Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.",
        "Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.\n"
        + "Barlangi Ember ÜGYESSÉG 7 ÉLETERŐ 7"
    };
    
    int ugyessseg = kockaDobas() + 6;
    int eletero = kockaDobas() * 2 + 12;
    int szerencse = kockaDobas() + 6;
    String oldal = "1";
    
    
    public JatekArena() {
        initComponents();
        szovegTxt.setText(szovegLista[0]);
        Aopcio.setText("270");
        Bopcio.setText("66");
        pbar_eletero.setValue(eletero);
        System.out.println(pbar_eletero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        szovegTxt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Aopcio = new javax.swing.JButton();
        Bopcio = new javax.swing.JButton();
        label_oldalszam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pbar_szerencse = new javax.swing.JProgressBar();
        pbar_ugyesseg = new javax.swing.JProgressBar();
        pbar_eletero = new javax.swing.JProgressBar();
        cbox_hatizsak = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 370));
        getContentPane().setLayout(null);

        szovegTxt.setEditable(false);
        szovegTxt.setColumns(20);
        szovegTxt.setLineWrap(true);
        szovegTxt.setRows(5);
        szovegTxt.setWrapStyleWord(true);
        szovegTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(szovegTxt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 150, 340, 120);

        Aopcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AopcioActionPerformed(evt);
            }
        });

        Bopcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BopcioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Aopcio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(Bopcio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bopcio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aopcio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 280, 220, 50);

        label_oldalszam.setText("1");
        getContentPane().add(label_oldalszam);
        label_oldalszam.setBounds(460, 280, 30, 16);

        pbar_szerencse.setMinimum(50);
        pbar_szerencse.setBorder(javax.swing.BorderFactory.createTitledBorder("Szerencse"));

        pbar_ugyesseg.setMinimum(50);
        pbar_ugyesseg.setBorder(javax.swing.BorderFactory.createTitledBorder("Ügyesség"));

        pbar_eletero.setForeground(new java.awt.Color(255, 51, 0));
        pbar_eletero.setMaximum(12);
        pbar_eletero.setMinimum(6);
        pbar_eletero.setToolTipText("");
        pbar_eletero.setValue(7);
        pbar_eletero.setBorder(javax.swing.BorderFactory.createTitledBorder("Életerő"));

        cbox_hatizsak.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pbar_eletero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_hatizsak, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbar_ugyesseg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbar_szerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(pbar_eletero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbar_ugyesseg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pbar_szerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cbox_hatizsak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 20, 220, 260);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private static int kockaDobas() {
        return (int) (Math.random());
    }
    
    void GombNyomas() {
        if (oldal=="270") {
            szovegTxt.setText(szovegLista[5]);
        } else {
        }
    }
    
    private void AopcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AopcioActionPerformed
        oldal = Aopcio.getText();
        label_oldalszam.setText(oldal);
        GombNyomas();
    }//GEN-LAST:event_AopcioActionPerformed

    private void BopcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BopcioActionPerformed
        GombNyomas();
    }//GEN-LAST:event_BopcioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JatekArena().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aopcio;
    private javax.swing.JButton Bopcio;
    private javax.swing.JComboBox<String> cbox_hatizsak;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_oldalszam;
    public static javax.swing.JProgressBar pbar_eletero;
    private javax.swing.JProgressBar pbar_szerencse;
    private javax.swing.JProgressBar pbar_ugyesseg;
    private javax.swing.JTextArea szovegTxt;
    // End of variables declaration//GEN-END:variables
}