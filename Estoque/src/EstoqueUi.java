
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Estoque;
import model.bean.Mercado;
import model.dao.EstoqueDAO;
import model.dao.MercadoDAO;

public class EstoqueUi extends javax.swing.JFrame {

    public static int id = 0;

    public EstoqueUi() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTProds.getModel();
        jTProds.setRowSorter(new TableRowSorter(modelo));
        if (id != 0) {
            readJEstoque();
        }

    }

    public void readJEstoque() {
        DefaultTableModel modelo = (DefaultTableModel) jTProds.getModel();
        modelo.setNumRows(0);
        EstoqueDAO estoqueDAO = new EstoqueDAO();

        for (Estoque e : estoqueDAO.read(id)) {
            modelo.addRow(new Object[]{
                e.getId(),
                e.getProduto(),
                e.getDescricao(),
                e.getQuantidade(),
                e.getValor()
            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFCad = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jTUsuario = new javax.swing.JTextField();
        jTSenha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jFLog = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTUsuario1 = new javax.swing.JTextField();
        jTSenha1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTQtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPreco = new javax.swing.JTextField();
        jBCad = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jBAtt = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        jTProds = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMCad = new javax.swing.JMenu();

        jFCad.setTitle("Cadastro");
        jFCad.setAlwaysOnTop(true);
        jFCad.setAutoRequestFocus(false);
        jFCad.setLocation(new java.awt.Point(50, 50));
        jFCad.setLocationByPlatform(true);
        jFCad.setMinimumSize(new java.awt.Dimension(225, 200));
        jFCad.setResizable(false);
        jFCad.setSize(new java.awt.Dimension(225, 230));
        jFCad.setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cadastro de Mercado");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mercado : ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cidade :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Senha :");

        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });

        jButton1.setText("cad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFCadLayout = new javax.swing.GroupLayout(jFCad.getContentPane());
        jFCad.getContentPane().setLayout(jFCadLayout);
        jFCadLayout.setHorizontalGroup(
            jFCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFCadLayout.setVerticalGroup(
            jFCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFLog.setAlwaysOnTop(true);
        jFLog.setAutoRequestFocus(false);
        jFLog.setLocation(new java.awt.Point(50, 50));
        jFLog.setMinimumSize(new java.awt.Dimension(225, 200));
        jFLog.setSize(new java.awt.Dimension(233, 116));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Login do Mercado");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usuario :");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Senha :");

        jButton2.setText("log");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFLogLayout = new javax.swing.GroupLayout(jFLog.getContentPane());
        jFLog.getContentPane().setLayout(jFLogLayout);
        jFLogLayout.setHorizontalGroup(
            jFLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFLogLayout.setVerticalGroup(
            jFLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jFLog.getAccessibleContext().setAccessibleName("Login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(465, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 300));

        jPFundo.setBackground(new java.awt.Color(153, 153, 153));
        jPFundo.setMinimumSize(new java.awt.Dimension(465, 300));
        jPFundo.setPreferredSize(new java.awt.Dimension(465, 300));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRODUTO");

        jTProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DESCRIÇÃO");

        jTDesc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("QUANTIDADE");

        jTQtd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PREÇO");

        jTPreco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        jTPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPrecoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTProd))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDesc))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTQtd))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTPreco))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtd)
                    .addComponent(jTDesc)
                    .addComponent(jTProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBCad.setText("Cadastrar");
        jBCad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        jBCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadActionPerformed(evt);
            }
        });

        jBDel.setText("Excluir");
        jBDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });

        jBAtt.setText("Atualizar");
        jBAtt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        jBAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAttActionPerformed(evt);
            }
        });

        jTProds.setBackground(new java.awt.Color(255, 255, 255));
        jTProds.setForeground(new java.awt.Color(0, 0, 0));
        jTProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Descrição", "QTD", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProds.setToolTipText("");
        jTProds.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTProds.setGridColor(new java.awt.Color(102, 102, 102));
        jTProds.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTProds.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTProds.setSurrendersFocusOnKeystroke(true);
        jTProds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdsMouseClicked(evt);
            }
        });
        table.setViewportView(jTProds);
        if (jTProds.getColumnModel().getColumnCount() > 0) {
            jTProds.getColumnModel().getColumn(0).setResizable(false);
            jTProds.getColumnModel().getColumn(0).setPreferredWidth(24);
            jTProds.getColumnModel().getColumn(1).setResizable(false);
            jTProds.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTProds.getColumnModel().getColumn(2).setResizable(false);
            jTProds.getColumnModel().getColumn(2).setPreferredWidth(185);
            jTProds.getColumnModel().getColumn(3).setResizable(false);
            jTProds.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTProds.getColumnModel().getColumn(4).setResizable(false);
            jTProds.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPFundoLayout = new javax.swing.GroupLayout(jPFundo);
        jPFundo.setLayout(jPFundoLayout);
        jPFundoLayout.setHorizontalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPFundoLayout.createSequentialGroup()
                        .addComponent(jBCad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jBDel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPFundoLayout.setVerticalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Login");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMCad.setText("Cadastro");
        jMCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMCadMouseClicked(evt);
            }
        });
        jMCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMCad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadActionPerformed
        Estoque estoque = new Estoque();
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        if (!"".equals(jTProd.getText()) && !"".equals(jTDesc.getText()) && !"".equals(jTQtd.getText()) && !"".equals(jTPreco.getText())) {

            estoque.setProduto(jTProd.getText());
            estoque.setDescricao(jTDesc.getText());
            estoque.setQuantidade(Integer.parseInt(jTQtd.getText()));
            estoque.setValor(Double.parseDouble(jTPreco.getText()));
            estoque.setMercado_id(id);
            estoqueDAO.create(estoque);
            jTProd.setText("");
            jTDesc.setText("");
            jTQtd.setText("");
            jTPreco.setText("");
            readJEstoque();
        } else {
            JOptionPane.showMessageDialog(null, "Revise o cadastro, existem caixas vazias !");
        }
    }//GEN-LAST:event_jBCadActionPerformed

    private void jTPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !"".equals(jTProd.getText()) && !"".equals(jTDesc.getText()) && !"".equals(jTQtd.getText()) && !"".equals(jTPreco.getText())) {
            Estoque estoque = new Estoque();
            EstoqueDAO estoqueDAO = new EstoqueDAO();
            estoque.setProduto(jTProd.getText());
            estoque.setDescricao(jTDesc.getText());
            estoque.setQuantidade(Integer.parseInt(jTQtd.getText()));
            estoque.setValor(Double.parseDouble(jTPreco.getText()));
            estoqueDAO.create(estoque);
            jTProd.setText("");
            jTDesc.setText("");
            jTQtd.setText("");
            jTPreco.setText("");
            readJEstoque();
        }
    }//GEN-LAST:event_jTPrecoKeyPressed

    private void jBAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAttActionPerformed
        if (jTProds.getSelectedRow() != -1) {
            Estoque estoque = new Estoque();
            EstoqueDAO estoqueDAO = new EstoqueDAO();
            estoque.setProduto(jTProd.getText());
            estoque.setDescricao(jTDesc.getText());
            estoque.setQuantidade(Integer.parseInt(jTQtd.getText()));
            estoque.setValor(Double.parseDouble(jTPreco.getText()));
            estoque.setId((int) jTProds.getValueAt(jTProds.getSelectedRow(), 0));
            estoque.setMercado_id(id);
            estoqueDAO.update(estoque);
            jTProd.setText("");
            jTDesc.setText("");
            jTQtd.setText("");
            jTPreco.setText("");
            readJEstoque();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar !");
        }
    }//GEN-LAST:event_jBAttActionPerformed

    private void jTProdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdsMouseClicked
        if (jTProds.getSelectedRow() != -1) {

            jTProd.setText(jTProds.getValueAt(jTProds.getSelectedRow(), 1).toString());
            jTDesc.setText(jTProds.getValueAt(jTProds.getSelectedRow(), 2).toString());
            jTQtd.setText(jTProds.getValueAt(jTProds.getSelectedRow(), 3).toString());
            jTPreco.setText(jTProds.getValueAt(jTProds.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTProdsMouseClicked

    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
        if (jTProds.getSelectedRow() != -1) {
            Estoque estoque = new Estoque();
            EstoqueDAO estoqueDAO = new EstoqueDAO();
            estoque.setId((int) jTProds.getValueAt(jTProds.getSelectedRow(), 0));
            estoque.setMercado_id(id);
            estoqueDAO.delete(estoque);
            jTProd.setText("");
            jTDesc.setText("");
            jTQtd.setText("");
            jTPreco.setText("");
            readJEstoque();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para deletar !");
        }
    }//GEN-LAST:event_jBDelActionPerformed

    private void jMCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadActionPerformed

    }//GEN-LAST:event_jMCadActionPerformed

    private void jMCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMCadMouseClicked
        jFCad.setVisible(true);
    }//GEN-LAST:event_jMCadMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Mercado mercado = new Mercado();
        MercadoDAO mercadoDAO = new MercadoDAO();
        mercado.setNome(jTNome.getText());
        mercado.setCidade(jTCidade.getText());
        mercado.setLogin(jTUsuario.getText());
        mercado.setSenha(jTSenha.getText());
        mercadoDAO.create(mercado);
        jFCad.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MercadoDAO mercadoDAO = new MercadoDAO();
        if (mercadoDAO.checkLogin(jTUsuario1.getText(), jTSenha1.getText())) {
            id = mercadoDAO.idGet(jTUsuario1.getText());
             readJEstoque();

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jFLog.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(EstoqueUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtt;
    private javax.swing.JButton jBCad;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFCad;
    private javax.swing.JFrame jFLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMCad;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPreco;
    private javax.swing.JTextField jTProd;
    private javax.swing.JTable jTProds;
    private javax.swing.JTextField jTQtd;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTextField jTSenha1;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTextField jTUsuario1;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
