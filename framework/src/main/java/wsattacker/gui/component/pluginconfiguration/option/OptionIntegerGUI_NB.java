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

import org.jdesktop.beansbinding.Validator;
import wsattacker.gui.component.pluginconfiguration.composition.OptionGUI;
import wsattacker.main.composition.plugin.option.AbstractOption;
import wsattacker.main.composition.plugin.option.AbstractOptionInteger;
import wsattacker.main.plugin.option.OptionSimpleInteger;

public class OptionIntegerGUI_NB extends OptionGUI {

	private AbstractOptionInteger option = new OptionSimpleInteger("Sample Option", 1, "Sample Description");
	public static final String PROP_OPTION = "option";

	/**
	 * Get the value of option
	 *
	 * @return the value of option
	 */
	public AbstractOptionInteger getOption() {
		return option;
	}

	/**
	 * Set the value of option
	 *
	 * @param option new value of option
	 */
	public void setOption(AbstractOptionInteger option) {
		AbstractOptionInteger oldOption = this.option;
		this.option = option;
		firePropertyChange(PROP_OPTION, oldOption, option);
	}

	/**
	 * Creates new form OptionVarcharGUI_NB
	 */
	public OptionIntegerGUI_NB() {
		initComponents();
	}

	public OptionIntegerGUI_NB(AbstractOptionInteger option) {
		this.option = option;
		initComponents();
	}

	private void setValueBackgroundIfError(boolean error) {
		if (error) {
			value.setBackground(COLOR_ERROR);
		} else {
			value.setBackground(COLOR_OK);
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

        name = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        description = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValue = new javax.swing.JLabel();

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${option.name}"), name, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue("Option Name");
        binding.setSourceUnreadableValue("Option Name");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${option.value}"), value, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        binding.setSourceNullValue("0");
        binding.setSourceUnreadableValue("0");
        binding.setValidator(new Validator<Integer>() {
            @Override
            public Validator<Integer>.Result validate(Integer value) {
                Validator<Integer>.Result result = null;
                if (!getOption().isValid(value)) {
                    result = new Validator.Result(1, "Value invalid");
                    setValueBackgroundIfError(true);
                } else {
                    setValueBackgroundIfError(false);
                }
                return result;
            }
        });
        bindingGroup.addBinding(binding);

        description.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${option.description}"), description, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue("Option Description");
        binding.setSourceUnreadableValue("Option Description");
        bindingGroup.addBinding(binding);

        typeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        typeLabel.setText("Type:");

        typeValue.setText("Integer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(value)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(description)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeValue)))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeValue)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel description;
    private javax.swing.JLabel name;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    private javax.swing.JTextField value;
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
