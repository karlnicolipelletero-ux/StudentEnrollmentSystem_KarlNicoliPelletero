package enrollmentsystem;

import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class MainDashboard extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainDashboard.class.getName());

    public MainDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cardPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnSaveStudent = new javax.swing.JButton();
        btnViewStudents = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCourseCredits = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAddCourse = new javax.swing.JButton();
        btnViewAllCourses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCourseDesc = new javax.swing.JTextArea();
        txtCourseName = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEnroll = new javax.swing.JButton();
        btnViewEnrollments = new javax.swing.JButton();
        comboCourse = new javax.swing.JComboBox<>();
        txtStudentName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));

        jButton1.setBackground(new java.awt.Color(37, 93, 178));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButton1.setText("Students");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButton3.setText("Courses");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButton4.setText("Enrollment");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        cardPanel.setBackground(new java.awt.Color(36, 36, 36));
        cardPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(36, 36, 36));

        txtFirstName.setPreferredSize(new java.awt.Dimension(400, 35));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Information");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtLastName.setPreferredSize(new java.awt.Dimension(400, 35));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        txtEmail.setPreferredSize(new java.awt.Dimension(400, 35));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");

        txtAge.setPreferredSize(new java.awt.Dimension(400, 35));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        btnSaveStudent.setBackground(new java.awt.Color(200, 103, 39));
        btnSaveStudent.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSaveStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveStudent.setText("Save Log");
        btnSaveStudent.setBorderPainted(false);
        btnSaveStudent.setFocusPainted(false);
        btnSaveStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveStudentMouseExited(evt);
            }
        });
        btnSaveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStudentActionPerformed(evt);
            }
        });

        btnViewStudents.setBackground(new java.awt.Color(51, 51, 51));
        btnViewStudents.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnViewStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStudents.setText("View Log");
        btnViewStudents.setBorderPainted(false);
        btnViewStudents.setFocusPainted(false);
        btnViewStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewStudentsMouseExited(evt);
            }
        });
        btnViewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSaveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel3, "studentCard");

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Information");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtCourseCredits.setPreferredSize(new java.awt.Dimension(400, 35));
        txtCourseCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseCreditsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Name:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Credits:");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description:");

        btnAddCourse.setBackground(new java.awt.Color(200, 103, 39));
        btnAddCourse.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCourse.setText("Add Course");
        btnAddCourse.setBorderPainted(false);
        btnAddCourse.setFocusPainted(false);
        btnAddCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddCourseMouseExited(evt);
            }
        });
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnViewAllCourses.setBackground(new java.awt.Color(51, 51, 51));
        btnViewAllCourses.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnViewAllCourses.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAllCourses.setText("View All Courses");
        btnViewAllCourses.setBorderPainted(false);
        btnViewAllCourses.setFocusPainted(false);
        btnViewAllCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewAllCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewAllCoursesMouseExited(evt);
            }
        });
        btnViewAllCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCoursesActionPerformed(evt);
            }
        });

        txtCourseDesc.setColumns(20);
        txtCourseDesc.setRows(5);
        jScrollPane1.setViewportView(txtCourseDesc);

        txtCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Bachelor of Science in ECE", "Bachelor of Science in Computer Engineering", "Bacherlor of Science in Civil Engineering", "Of Course!" }));
        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtCourseCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAddCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewAllCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(txtCourseCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAllCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel2, "courseCard");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Enrollment");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student's Full Name:");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Select Course:");

        btnEnroll.setBackground(new java.awt.Color(200, 103, 39));
        btnEnroll.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEnroll.setForeground(new java.awt.Color(255, 255, 255));
        btnEnroll.setText("Enroll");
        btnEnroll.setBorderPainted(false);
        btnEnroll.setFocusPainted(false);
        btnEnroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnrollMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnrollMouseExited(evt);
            }
        });
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });

        btnViewEnrollments.setBackground(new java.awt.Color(51, 51, 51));
        btnViewEnrollments.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnViewEnrollments.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEnrollments.setText("View all Enrollments");
        btnViewEnrollments.setBorderPainted(false);
        btnViewEnrollments.setFocusPainted(false);
        btnViewEnrollments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewEnrollmentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewEnrollmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewEnrollmentsMouseExited(evt);
            }
        });
        btnViewEnrollments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEnrollmentsActionPerformed(evt);
            }
        });

        comboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Bachelor of Science in ECE", "Bachelor of Science in Computer Engineering", "Bacherlor of Science in Civil Engineering", "Of Course!" }));
        comboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewEnrollments, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addGap(252, 252, 252)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel10)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewEnrollments, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel4, "enrollCard");

        getContentPane().add(cardPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout card = (CardLayout) cardPanel.getLayout();
        card.show(cardPanel, "studentCard");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) cardPanel.getLayout();
        card.show(cardPanel, "courseCard");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout card = (CardLayout) cardPanel.getLayout();
        card.show(cardPanel, "enrollCard");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnSaveStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveStudentMouseEntered
        btnSaveStudent.setBackground(new java.awt.Color(222, 132, 73));
    }//GEN-LAST:event_btnSaveStudentMouseEntered

    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();
        String ageStr = txtAge.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || ageStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        try {
            java.sql.Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO Student (first_name, last_name, age, email) VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setInt(3, Integer.parseInt(ageStr));
            pst.setString(4, email);

            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Student saved to database successfully!");

            txtFirstName.setText("");
            txtLastName.setText("");
            txtEmail.setText("");
            txtAge.setText("");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Age must be a number.");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveStudentActionPerformed

    private void btnSaveStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveStudentMouseExited
        btnSaveStudent.setBackground(new java.awt.Color(200, 103, 39));
    }//GEN-LAST:event_btnSaveStudentMouseExited

    private void btnViewStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStudentsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStudentsMouseEntered

    private void btnViewStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStudentsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStudentsMouseExited

    private void btnViewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentsActionPerformed

        StudentTableFrame tableWindow = new StudentTableFrame();

        tableWindow.setLocationRelativeTo(null);

        tableWindow.setVisible(true);

        tableWindow.loadData();
    }//GEN-LAST:event_btnViewStudentsActionPerformed

    private void txtCourseCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseCreditsActionPerformed

    private void btnAddCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCourseMouseEntered

    private void btnAddCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCourseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCourseMouseExited

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed

        String courseName = "";
        if (txtCourseName.getSelectedItem() != null) {
            courseName = txtCourseName.getSelectedItem().toString().trim();
        }

        String creditsText = txtCourseCredits.getText().trim();
        String courseDesc = txtCourseDesc.getText().trim();

        if (courseName.isEmpty() || creditsText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a Course Name and enter Credits!");
            return;
        }

        try {

            int credits = Integer.parseInt(creditsText);

            java.sql.Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO course (course_name, credits, course_description) VALUES (?, ?, ?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, courseName);
            pst.setInt(2, credits);
            pst.setString(3, courseDesc);

            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Course Saved Successfully!");

            txtCourseName.setSelectedIndex(0);
            txtCourseCredits.setText("");
            txtCourseDesc.setText("");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Course Credits must be a valid number!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnViewAllCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllCoursesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAllCoursesMouseEntered

    private void btnViewAllCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllCoursesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAllCoursesMouseExited

    private void btnViewAllCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCoursesActionPerformed
        CourseTableFrame courseFrame = new CourseTableFrame();
        courseFrame.setVisible(true);

    }//GEN-LAST:event_btnViewAllCoursesActionPerformed

    private void btnEnrollMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnrollMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnrollMouseEntered

    private void btnEnrollMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnrollMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnrollMouseExited

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed

        String name = txtStudentName.getText().trim();
        String course = comboCourse.getSelectedItem().toString();

        if (name.isEmpty() || course.equals("--Select Course--")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter the Student's Full Name and select a course!");
            return;
        }

        try {

            java.sql.Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO enrolled_subject (student_name, course_name) VALUES (?, ?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, course);

            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Student Enrolled Successfully!");

            txtStudentName.setText("");
            comboCourse.setSelectedIndex(0);

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }

    }//GEN-LAST:event_btnEnrollActionPerformed

    private void btnViewEnrollmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewEnrollmentsMouseEntered

    }//GEN-LAST:event_btnViewEnrollmentsMouseEntered

    private void btnViewEnrollmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewEnrollmentsMouseExited

    }//GEN-LAST:event_btnViewEnrollmentsMouseExited

    private void btnViewEnrollmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEnrollmentsActionPerformed

        try {

            enrollmentsystem.EnrollmentListSystem list = new enrollmentsystem.EnrollmentListSystem();

            list.setLocationRelativeTo(null);

            list.setVisible(true);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error opening window: " + e.getMessage());
        }

    }//GEN-LAST:event_btnViewEnrollmentsActionPerformed

    private void btnViewEnrollmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewEnrollmentsMouseClicked

    }//GEN-LAST:event_btnViewEnrollmentsMouseClicked

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void comboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCourseActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainDashboard().setVisible(true);
        });
    }

    public void loadEnrollmentData() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JButton btnSaveStudent;
    private javax.swing.JButton btnViewAllCourses;
    private javax.swing.JButton btnViewEnrollments;
    private javax.swing.JButton btnViewStudents;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JComboBox<String> comboCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCourseCredits;
    private javax.swing.JTextArea txtCourseDesc;
    private javax.swing.JComboBox<String> txtCourseName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables

}
