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
package wsattacker.gui.component.pluginconfiguration.subcomponent;

import java.awt.Component;
import java.awt.Dimension;
import java.beans.IndexedPropertyChangeEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import org.jdesktop.beansbinding.PropertyResolutionException;
import org.jdesktop.el.ELException;
import wsattacker.gui.component.pluginconfiguration.composition.OptionGUI;
import wsattacker.gui.component.pluginconfiguration.controller.SelectedPluginController;
import wsattacker.main.composition.plugin.AbstractPlugin;
import wsattacker.main.composition.plugin.option.AbstractOption;
import wsattacker.main.plugin.PluginOptionContainer;

/**
 *
 * @author christian
 */
public class SelectedPlugin extends javax.swing.JPanel implements PropertyChangeListener {

	final private static Logger LOG = Logger.getLogger(SelectedPlugin.class);

	/**
	 * Creates new form SelectedPlugin
	 */
	public SelectedPlugin() {
		initComponents();
		selectedPluginController.addPropertyChangeListener(this);
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

        selectedPluginController = new wsattacker.gui.component.pluginconfiguration.controller.SelectedPluginController();
        nameLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        versionValue = new javax.swing.JLabel();
        authorValue = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionValue = new javax.swing.JTextPane();
        optionLabel = new javax.swing.JLabel();
        optionScrollPane = new javax.swing.JScrollPane();
        optionPanel = new javax.swing.JPanel();

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedPluginController, org.jdesktop.beansbinding.ELProperty.create("${selectedPlugin.name}"), nameLabel, org.jdesktop.beansbinding.BeanProperty.create("text"), "pluginName");
        bindingGroup.addBinding(binding);

        authorLabel.setText("Author:");

        versionLabel.setText("Version:");

        versionValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedPluginController, org.jdesktop.beansbinding.ELProperty.create("${selectedPlugin.version}"), versionValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        authorValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedPluginController, org.jdesktop.beansbinding.ELProperty.create("${selectedPlugin.author}"), authorValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        descriptionLabel.setText("Description:");

        descriptionValue.setEditable(false);
        descriptionValue.setBackground(new java.awt.Color(238, 238, 238));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedPluginController, org.jdesktop.beansbinding.ELProperty.create("${selectedPlugin.description}"), descriptionValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        descriptionScrollPane.setViewportView(descriptionValue);

        optionLabel.setText("Options:");

        optionScrollPane.setMaximumSize(new java.awt.Dimension(200, 32767));

        optionPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionPanel.setLayout(new javax.swing.BoxLayout(optionPanel, javax.swing.BoxLayout.Y_AXIS));
        optionScrollPane.setViewportView(optionPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(descriptionScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(authorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(authorValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(versionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(versionValue))
                            .addComponent(descriptionLabel)
                            .addComponent(optionLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(authorValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionLabel)
                    .addComponent(versionValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel authorValue;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextPane descriptionValue;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JScrollPane optionScrollPane;
    private wsattacker.gui.component.pluginconfiguration.controller.SelectedPluginController selectedPluginController;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel versionValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

	public SelectedPluginController getSelectedPluginController() {
		return selectedPluginController;
	}

	@Override
	public void propertyChange(PropertyChangeEvent pce) {
		String propertyName = pce.getPropertyName();
		if (SelectedPluginController.PROP_SELECTEDPLUGIN.equals(propertyName)) {
			List<AbstractOption> newOptions = ((AbstractPlugin) pce.getNewValue()).getPluginOptions().getOptions();
			removeAndUnbindAllComponents();
			handleMultipleNewOptions(0, Collections.<AbstractOption>emptyList(), newOptions);
			adjustingOptionPanelSize();
			handleOptionContainerChangeListener(pce);
		} else if (pce instanceof IndexedPropertyChangeEvent && PluginOptionContainer.PROP_OPTIONS.equals(pce.getPropertyName())) {
			IndexedPropertyChangeEvent ipce = (IndexedPropertyChangeEvent) pce;
			int index = ipce.getIndex();
			if (ipce.getNewValue() instanceof List) {
				// multiple changes
				List<AbstractOption> oldValue = (List<AbstractOption>) ipce.getOldValue();
				List<AbstractOption> newValue = (List<AbstractOption>) ipce.getNewValue();
				handleMultipleNewOptions(index, oldValue, newValue);
			} else if (ipce.getNewValue() instanceof AbstractOption) {
				handleReplacedOption(index, ipce);
			}
		}
	}

	private OptionGUI createOption(AbstractOption option) {
		return option.createOptionGUI();
	}

	private void handleOptionContainerChangeListener(PropertyChangeEvent pce) {
		AbstractPlugin oldPlugin = (AbstractPlugin) pce.getOldValue();
		AbstractPlugin newPlugin = (AbstractPlugin) pce.getNewValue();
		if (oldPlugin != null) {
			oldPlugin.getPluginOptions().removePropertyChangeListener(this);
		}
		if (newPlugin != null) {
			newPlugin.getPluginOptions().addPropertyChangeListener(this);
		}
	}

	private void handleMultipleNewOptions(int index, List<AbstractOption> oldValue, List<AbstractOption> newValue) {
		List<AbstractOption> oldOptions = new ArrayList<AbstractOption>(oldValue);
		removeNoLongerUsedOptions(oldOptions, newValue);

		// insert new options
		for (int newIndex = 0; newIndex < newValue.size(); ++newIndex) {
			AbstractOption newOption = newValue.get(newIndex);
			int oldIndex = oldOptions.indexOf(newOption);

			if (oldIndex == newIndex) {
				// nothing to do
				continue;
			} else if (oldIndex < 0) {
				insertOptionAtPosition(newOption, newIndex, oldOptions);
			} else {
				moveOption(oldIndex, newIndex, oldOptions);
			}
		}
	}

	private void handleReplacedOption(int index, IndexedPropertyChangeEvent ipce) {
		// single change
		try {
			optionPanel.remove(index);
			AbstractOption option = (AbstractOption) ipce.getNewValue();
			LOG.debug("Created Option " + option.getName());
			OptionGUI optionGUI = createOption(option);
			optionPanel.add(optionGUI, index);
		}
		catch (Exception e) {
			LOG.warn(e);
		}
	}

	private void removeAndUnbind(int index) {
		if (optionPanel.getComponent(index) instanceof OptionGUI) {
			OptionGUI option = (OptionGUI) optionPanel.getComponent(index);
			try {
				option.bindingDoUnbind();
			}
			catch (ELException e) {
				LOG.warn(e);
			}
			catch (PropertyResolutionException e) {
				LOG.warn(e);
			}
		}
		optionPanel.remove(index);
	}

	private void removeAndUnbindAllComponents() {
		int max = optionPanel.getComponentCount();
		for (int i = 0; i < max; ++i) {
			removeAndUnbind(0);
		}
	}

	JPanel getOptionPanel() {
		return optionPanel;
	}

	private void removeNoLongerUsedOptions(List<AbstractOption> oldOptions, List<AbstractOption> newOptions) {
		int end = oldOptions.size() - 1;
		for (int oldIndex = end; oldIndex >= 0; --oldIndex) {
			AbstractOption o = oldOptions.get(oldIndex);
			if (!newOptions.contains(o)) {
				removeAndUnbind(oldIndex);
				oldOptions.remove(oldIndex);
			}
		}
	}

	private void insertOptionAtPosition(AbstractOption newOption, int newIndex, List<AbstractOption> oldOptions) {
		// insert at correct position;
		try {
			LOG.debug("Created Option " + newOption.getName());
			OptionGUI optionGUI = createOption(newOption);
			optionPanel.add(optionGUI, newIndex);
			oldOptions.add(newIndex, newOption);
		}
		catch (Exception e) {
			LOG.warn(e);
		}
	}

	private void moveOption(int oldIndex, int newIndex, List<AbstractOption> oldOptions) {
		// move to corect position
		Component component = optionPanel.getComponent(oldIndex);
		optionPanel.remove(component);
		// TODO: This is wrong
		optionPanel.add(component, newIndex);
		oldOptions.add(newIndex, oldOptions.remove(oldIndex));
	}

	private void adjustingOptionPanelSize() {
		int width = optionScrollPane.getSize().width - 20;
		for (int i = 0; i < optionPanel.getComponentCount(); ++i) {
			Component c = optionPanel.getComponent(i);
			int height = c.getPreferredSize().height;
			c.setPreferredSize(new Dimension(width, height));
		}
		optionPanel.setSize(optionPanel.getPreferredSize());
	}
}
