package br.com.urtune.view;

import br.com.urtune.control.Arvore;
import br.com.urtune.control.ListaCircular;
import br.com.urtune.control.Pilha;
import br.com.urtune.model.Album;
import br.com.urtune.model.Artista;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author luan
 */
public class welcome extends javax.swing.JFrame {
    
    //Objetos necessários para o método todo
    static Arvore tree = new Arvore();
    Artista oEscolhido;
    Album albumSelecionado;
    playing newFrame = new playing();
    
    public welcome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtArtista = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblArtista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAlbum = new javax.swing.JLabel();
        bTocar = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bBefore = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Seja bem-vindo ao UrTune!");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Digite o artista que você procura:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Escolha o álbum do artista:");

        lblArtista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblArtista.setText("...");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Álbum:");

        lblAlbum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlbum.setText("...");

        bTocar.setText("Tocar álbum");
        bTocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTocarActionPerformed(evt);
            }
        });

        bNext.setText("Próximo");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bBefore.setText("Anterior");
        bBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBeforeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArtista)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bBefore)
                        .addGap(57, 57, 57)
                        .addComponent(bTocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(bNext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblArtista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAlbum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBefore)
                    .addComponent(bTocar)
                    .addComponent(bNext))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        //tree = tree.getInstace();
        oEscolhido = tree.buscar(txtArtista.getText(), tree.getRaiz());
        if(oEscolhido!=null){
            lblArtista.setText(oEscolhido.getNome());
            albumSelecionado = oEscolhido.albuns.getPrimeiro();
            lblAlbum.setText(albumSelecionado.getNome());
        } else {
        JOptionPane.showMessageDialog(null,"Infelizmente, esse artista não está cadastrado em nosso banco de dados!");
        }

    }//GEN-LAST:event_bBuscarActionPerformed

    private void bBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBeforeActionPerformed
        albumSelecionado = albumSelecionado.getAnterior();
        lblAlbum.setText(albumSelecionado.toString());
    }//GEN-LAST:event_bBeforeActionPerformed

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        albumSelecionado = albumSelecionado.getProximo();
        lblAlbum.setText(albumSelecionado.toString());
    }//GEN-LAST:event_bNextActionPerformed

    private void bTocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTocarActionPerformed
        if (!albumSelecionado.musicas.isEmpty()){
            newFrame.showInf(this, albumSelecionado);
            newFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Este álbum está vazio :/");
        }
    }//GEN-LAST:event_bTocarActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
        
        
        //criando o artista
        Artista av = new Artista("ANAVITÓRIA","MPB");
        //Criando a lista de albuns
        ListaCircular albuns_anavit = new ListaCircular();
        ///criando os albuns do artista
        Album otea = new Album("O TEMPO É AGORA",av);
        Album cpf = new Album("ANAVITÓRIA CANTA PARA FOLIÕES", av);
        Album a = new Album("ANAVITÓRIA",av);
        Album ai = new Album("AMORES IMPERFEITOS",av);
        //inserindo os albuns no artista na lista circular
        albuns_anavit.inserir(cpf);
        albuns_anavit.inserir(otea);
        albuns_anavit.inserir(a);
        albuns_anavit.inserir(ai);
        
        //Criando a pilha de músicas de um determinado álbum
        Pilha anavit_otea = new Pilha (3);
        //inserindo as músicas do artista na pilha
        anavit_otea.push("CECILIA", "cecilia.WAV");
        anavit_otea.push("A GENTE JUNTO", "a_gente_junto.WAV");
        anavit_otea.push("PORQUE EU TE AMO", "porque_eu_te_amo.WAV");
        //inserindo a pilha de músicas no album
        otea.setMusicas(anavit_otea);
        
        //Criando a pilha de músicas de um determinado álbum
        Pilha anavit_ai = new Pilha (3);
        //inserindo as músicas do artista na pilha
        anavit_ai.push("AMORES IMPERFEITOS", "amores_imperfeitos.WAV");
        //inserindo a pilha de músicas no album
        ai.setMusicas(anavit_ai);
        
        //Criando a pilha de músicas de um determinado álbum
        Pilha anavit_a = new Pilha (3);
        //inserindo as músicas do artista na pilha
        anavit_a.push("SINGULAR", "singular.WAV");
        anavit_a.push("COR DE MARTE", "cor_de_marte.WAV");
        anavit_a.push("AGORA EU QUERO IR", "agora_eu_quero_ir.WAV");
        //inserindo a pilha de músicas no album
        a.setMusicas(anavit_a);
        
        //Criando a pilha de músicas de um determinado álbum
        Pilha anavit_cpf = new Pilha (3);
        //inserindo as músicas do artista na pilha
        
        //inserindo a pilha de músicas no album
        cpf.setMusicas(anavit_cpf);
        
        av.albuns = albuns_anavit;
        tree.insert(av);
        
        
        //criando o artista
        Artista bc = new Artista("BRADLEY COOPER","POP");
        //Criando a lista de albuns
        ListaCircular albuns_bc = new ListaCircular();
        //criando os albuns do artista
        Album asib = new Album("A STAR IS BORN",av);
        //Criando a pilha de músicas de um determinado álbum
        Pilha bc_asib = new Pilha (3);
        //inserindo os albuns no artista na lista circular
        albuns_bc.inserir(asib);
        //inserindo as músicas do artista na pilha
        bc_asib.push("BLACK EYES", "black_eyes.WAV");
        //inserindo a pilha de músicas no album
        asib.setMusicas(bc_asib);
        bc.albuns = albuns_bc;
        tree.insert(bc);
        
        
        //criando o artista
        Artista cp = new Artista("COLDPLAY","POP ROCK");
        //criando os albuns do artista
        Album ahfod = new Album("A HEAD FULL OF DREAMS",cp);
        Album gh = new Album("GHOST STORIES",cp);
        Album mx = new Album("MYLO XYLOTO", cp);
        //Criando a lista de albuns
        ListaCircular albuns_cp = new ListaCircular();
        //Criando a pilha de músicas de um determinado álbum
        Pilha cp_ahfod = new Pilha (4);
        Pilha cp_gh = new Pilha (3);
        Pilha cp_mx = new Pilha (3);
        //inserindo os albuns no artista na lista circular
        albuns_cp.inserir(gh);
        albuns_cp.inserir(ahfod);
        albuns_cp.inserir(mx);
        //inserindo as músicas do artista na pilha
        cp_ahfod.push("A HEAD FULL OF DREAMS", "a_head_full_of_dreams.WAV");
        cp_ahfod.push("ADVENTURE OF A LIFETIME","adventure_of_a_lifetime.WAV");
        cp_ahfod.push("HYMM FOR THE WEEKEND","hymmfortheweekend.WAV");
        cp_ahfod.push("UP AND UP","upandup.WAV");
        
        cp_gh.push("A SKY FULL OF STARS", "a_sky_full_of_stars.WAV");
        cp_gh.push("ALWAYS IN MY HEAD", "always_in_my_head.WAV");
        
        cp_mx.push("PARADISE", "paradise.WAV");
        cp_mx.push("VIVA LA VIDA","viva_la_vida.WAV");
        //inserindo a pilha de músicas no album
        ahfod.setMusicas(cp_ahfod);
        gh.setMusicas(cp_gh);
        mx.setMusicas(cp_mx);
        
        cp.albuns = albuns_cp;
        tree.insert(cp);
        
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBefore;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bTocar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAlbum;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JTextField txtArtista;
    // End of variables declaration//GEN-END:variables
}
