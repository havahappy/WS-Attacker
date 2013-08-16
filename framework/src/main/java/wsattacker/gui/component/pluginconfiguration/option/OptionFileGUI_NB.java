/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2010 Christian Mainka
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.gui.component.pluginconfiguration.option;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import org.jdesktop.beansbinding.Converter;
import wsattacker.gui.component.pluginconfiguration.composition.OptionGUI;
import wsattacker.main.composition.plugin.option.AbstractOption;
import wsattacker.main.composition.plugin.option.AbstractOptionFile;
import wsattacker.main.plugin.option.OptionSimpleFile;

public class OptionFileGUI_NB extends OptionGUI {

	private AbstractOptionFile option = new OptionSimpleFile("Sample File Option", "Sample File Description");
	public static final String PROP_OPTION = "option";

	/**
	 * Get the value of option
	 *
	 * @return the value of option
	 */
	public AbstractOptionFile getOption() {
		return option;
	}

	/**
	 * Set the value of option
	 *
	 * @param option new value of option
	 */
	public void setOption(AbstractOptionFile option) {
		AbstractOptionFile oldOption = this.option;
		this.option = option;
		firePropertyChange(PROP_OPTION, oldOption, option);
	}

	/**
	 * Creates new form OptionVarcharGUI_NB
	 */
	public OptionFileGUI_NB() {
		initComponents();
	}

	public OptionFileGUI_NB(AbstractOptionFile option) {
		this.option = option;
		initComponents();
	}

	private void setValueBackgroundIfError(boolean error) {
		if (error) {
			fileButton.setBackground(COLOR_ERROR);
		} else {
			fileButton.setBackground(COLOR_OK);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        fileChooser = new javax.swing.JFileChooser();
        name = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        currentFileLabel = new javax.swing.JLabel();
        currentFileValue = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValue = new javax.swing.JLabel();
        fileButton = new javax.swing.JButton();

        fileChooser.setDialogTitle("Select the File");
        fileChooser.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return getOption().getDescription();
            }

            @Override
            public boolean accept(File f) {
                // always show directories
                if(f.isDirectory()) {
                    return true;
                }
                return getOption().isValid(f);
            }
        });

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${option.name}"), name, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue("Option Name");
        binding.setSourceUnreadableValue("Option Name");
        bindingGroup.addBinding(binding);

        description.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${option.description}"), description, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue("Option Description");
        binding.setSourceUnreadableValue("Option Description");
        bindingGroup.addBinding(binding);

        currentFileLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        currentFileLabel.setText("Current File:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${option.file}"), currentFileValue, org.jdesktop.beansbinding.BeanProperty.create("text"), option.getName());
        binding.setConverter(new Converter<File, String>() {

            @Override
            public String convertForward(File value) {
                return String.format("%s", value.getName());
            }

            @Override
            public File convertReverse(String value) {
                return new File(value);
            }
        });
        bindingGroup.addBinding(binding);

        typeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        typeLabel.setText("Type:");

        typeValue.setText("File");

        fileButton.setText("Select a File");
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(description)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentFileLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentFileValue))
                    .addComponent(fileButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentFileLabel)
                    .addComponent(currentFileValue)
                    .addComponent(typeLabel)
                    .addComponent(typeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			boolean valid = option.isValid(file);
			setValueBackgroundIfError(!valid);
			if (valid) {
				option.setFile(file);
			}
		}
    }//GEN-LAST:event_fileButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentFileLabel;
    private javax.swing.JLabel currentFileValue;
    private javax.swing.JLabel description;
    private javax.swing.JButton fileButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel name;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

	@Override
	public void bindingDoUnbind() {
		bindingGroup.unbind();
	}

	@Override
	public AbstractOption getUsedOption() {
		return option;
	}
}
