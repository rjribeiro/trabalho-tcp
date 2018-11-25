/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import salva.arquivo.ArquivoMIDI;
import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author beret
 */
public class InterfaceDeSalvar extends javax.swing.JFrame {

    private String texto_traduzido = new String();
    
    public InterfaceDeSalvar() 
    {
        initComponents();
    }
    
    public void set_texto(String texto_salvar)
    {   
        if("".equals(texto_salvar) || texto_salvar == null)
        {
            JOptionPane.showMessageDialog(this, "O texto está vazio", "WARNING!", JOptionPane.WARNING_MESSAGE, null);
        }
        
        this.texto_traduzido = texto_salvar;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaosalvar = new javax.swing.JButton();
        botaocancelar = new javax.swing.JButton();
        nome_do_arquivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaosalvar.setText("Salvar");
        botaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosalvarActionPerformed(evt);
            }
        });

        botaocancelar.setText("Cancelar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });

        nome_do_arquivo.setText("Digite o nome do arquivo...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                        .addComponent(botaocancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaosalvar))
                    .addComponent(nome_do_arquivo))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_do_arquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaosalvar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaocancelar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosalvarActionPerformed
       ArquivoMIDI arquivo = new ArquivoMIDI(texto_traduzido);
       try 
        {   
            if("".equals(nome_do_arquivo.getText()) || "Digite o nome do arquivo...".equals(nome_do_arquivo.getText()) || nome_do_arquivo.getText() == null)
            {
                JOptionPane.showMessageDialog(this, "Nome para o arquivo a ser salvo não foi informado.", "ERRO!", JOptionPane.ERROR_MESSAGE, null);
            }
            else
            {
                arquivo.SalvaArquivo(nome_do_arquivo.getText());
            }
            
        } 
        catch (IOException ex) 
        {   
            Logger.getLogger(InterfaceDeSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_botaosalvarActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaocancelarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceDeSalvar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceDeSalvar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceDeSalvar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceDeSalvar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            InterfaceDeSalvar teladesalvar = new InterfaceDeSalvar();
            
            teladesalvar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            teladesalvar.addWindowListener(new WindowAdapter(){
                   
                
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaosalvar;
    private javax.swing.JTextField nome_do_arquivo;
    // End of variables declaration//GEN-END:variables
}
