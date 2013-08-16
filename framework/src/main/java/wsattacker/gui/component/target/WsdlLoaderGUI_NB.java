/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsattacker.gui.component.target;

import java.beans.PropertyChangeSupport;
import javax.swing.JButton;
import javax.swing.JTextField;
import wsattacker.gui.component.target.subcomponent.InterfaceComboBox;
import wsattacker.gui.component.target.subcomponent.OperationComboBox;
import wsattacker.gui.component.target.subcomponent.RequestInputTableModel;
import wsattacker.main.composition.ControllerInterface;

/**
 *
 * @author christian
 */
public class WsdlLoaderGUI_NB extends javax.swing.JPanel {
    public static final String PROP_CONTROLLER = "controller";

    private ControllerInterface controller = null;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * Creates new form WsdlLoaderGUI_NB
     */
    public WsdlLoaderGUI_NB() {
        initComponents();
    }


    	public JTextField getUriField() {
		return wsdlInputField;
	}

	public JButton getLoadButton() {
		return load;
	}

	public JButton getNewRequestButtom() {
		return newRequestButton;
	}

        public InterfaceComboBox getServiceComboBox() {
            return interfaceComboBox;
        }

        public OperationComboBox getOperationComboBox() {
            return operationComboBox;
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namespaceTableModel = new wsattacker.gui.component.target.subcomponent.NamespaceTableModel();
        splitter = new javax.swing.JSplitPane();
        bottomTab = new javax.swing.JTabbedPane();
        requestInputTableScrollPane = new javax.swing.JScrollPane();
        requestInputTable = new wsattacker.gui.component.target.subcomponent.RequestInputTable();
        requestInputEditorScrollPane = new javax.swing.JScrollPane();
        requestInputEditor = new wsattacker.gui.component.target.subcomponent.RequestInputEditor();
        namespaceTableScrollPane = new javax.swing.JScrollPane();
        namespaceTable = new javax.swing.JTable();
        operationPanel = new javax.swing.JPanel();
        operationComboBox = new wsattacker.gui.component.target.subcomponent.OperationComboBox();
        interfacePanel = new javax.swing.JPanel();
        interfaceComboBox = new wsattacker.gui.component.target.subcomponent.InterfaceComboBox();
        wsdlPanel = new javax.swing.JPanel();
        wsdlInputField = new wsattacker.gui.component.target.subcomponent.WsdlInputField();
        newRequestButton = new javax.swing.JButton();
        load = new javax.swing.JButton();

        setName("WSDL Loader"); // NOI18N

        splitter.setDividerLocation(100);
        splitter.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        requestInputTableScrollPane.setViewportView(requestInputTable);

        bottomTab.addTab("Request Input Table", requestInputTableScrollPane);

        requestInputEditorScrollPane.setViewportView(requestInputEditor);

        bottomTab.addTab("Request Expert View", requestInputEditorScrollPane);

        splitter.setBottomComponent(bottomTab);

        namespaceTable.setModel(namespaceTableModel);
        namespaceTableScrollPane.setViewportView(namespaceTable);

        splitter.setLeftComponent(namespaceTableScrollPane);

        operationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Operation"));

        javax.swing.GroupLayout operationPanelLayout = new javax.swing.GroupLayout(operationPanel);
        operationPanel.setLayout(operationPanelLayout);
        operationPanelLayout.setHorizontalGroup(
            operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(operationComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        operationPanelLayout.setVerticalGroup(
            operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        interfacePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Interface"));

        javax.swing.GroupLayout interfacePanelLayout = new javax.swing.GroupLayout(interfacePanel);
        interfacePanel.setLayout(interfacePanelLayout);
        interfacePanelLayout.setHorizontalGroup(
            interfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(interfaceComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        interfacePanelLayout.setVerticalGroup(
            interfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        wsdlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("WSDL"));

        javax.swing.GroupLayout wsdlPanelLayout = new javax.swing.GroupLayout(wsdlPanel);
        wsdlPanel.setLayout(wsdlPanelLayout);
        wsdlPanelLayout.setHorizontalGroup(
            wsdlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wsdlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wsdlInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        wsdlPanelLayout.setVerticalGroup(
            wsdlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wsdlPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(wsdlInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        newRequestButton.setText("New");
        newRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRequestButtonActionPerformed(evt);
            }
        });

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(interfacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(operationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(wsdlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(load)
                    .addComponent(wsdlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(newRequestButton)
                    .addComponent(operationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interfacePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        controller.setWsdl(wsdlInputField.getText());
    }//GEN-LAST:event_loadActionPerformed

    private void newRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRequestButtonActionPerformed
        controller.resetRequestContent();
    }//GEN-LAST:event_newRequestButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane bottomTab;
    private wsattacker.gui.component.target.subcomponent.InterfaceComboBox interfaceComboBox;
    private javax.swing.JPanel interfacePanel;
    private javax.swing.JButton load;
    private javax.swing.JTable namespaceTable;
    private wsattacker.gui.component.target.subcomponent.NamespaceTableModel namespaceTableModel;
    private javax.swing.JScrollPane namespaceTableScrollPane;
    private javax.swing.JButton newRequestButton;
    private wsattacker.gui.component.target.subcomponent.OperationComboBox operationComboBox;
    private javax.swing.JPanel operationPanel;
    private wsattacker.gui.component.target.subcomponent.RequestInputEditor requestInputEditor;
    private javax.swing.JScrollPane requestInputEditorScrollPane;
    private wsattacker.gui.component.target.subcomponent.RequestInputTable requestInputTable;
    private javax.swing.JScrollPane requestInputTableScrollPane;
    private javax.swing.JSplitPane splitter;
    private wsattacker.gui.component.target.subcomponent.WsdlInputField wsdlInputField;
    private javax.swing.JPanel wsdlPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the controller
     */
    public ControllerInterface getController() {
        return controller;
    }

    /**
     * @param controller the controller to set
     */
    public void setController(ControllerInterface controller) {
        wsattacker.main.composition.ControllerInterface oldController = controller;
        this.controller = controller;
        propertyChangeSupport.firePropertyChange(PROP_CONTROLLER, oldController, controller);
		// TODO: It would be much nicer if the controller is set via "Bindings",
		// But unfortunally, this does not work...
		interfaceComboBox.setController(controller);
		operationComboBox.setController(controller);
		requestInputEditor.setController(controller);
		namespaceTableModel.setController(controller);
		RequestInputTableModel model = (RequestInputTableModel) requestInputTable.getModel();
		model.setController(controller);
    }
}
