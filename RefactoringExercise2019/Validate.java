/*import java.awt.Color;
import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Validate {
	
	private long currentByteStart = 0;
	private RandomFile application = new RandomFile();
	private File file;
	
	private JTextField idField, ppsField, surnameField, firstNameField, salaryField;
	private JComboBox<String> genderCombo, departmentCombo, fullTimeCombo;

	
	
	
	private boolean checkInput() {
		boolean valid = true;
	
		if (ppsField.isEditable() && ppsField.getText().trim().isEmpty()) {
			ppsField.setBackground(Colours.red);
			valid = false;
		} 
		if (ppsField.isEditable() && correctPps(ppsField.getText().trim(), currentByteStart)) {
			ppsField.setBackground(Colours.red);
			valid = false;
		} 
		if (surnameField.isEditable() && surnameField.getText().trim().isEmpty()) {
			surnameField.setBackground(Colours.red);
			valid = false;
		} 
		if (firstNameField.isEditable() && firstNameField.getText().trim().isEmpty()) {
			firstNameField.setBackground(Colours.red);
			valid = false;
		} 
		if (genderCombo.getSelectedIndex() == 0 && genderCombo.isEnabled()) {
			genderCombo.setBackground(Colours.red);
			valid = false;
		} 
		if (departmentCombo.getSelectedIndex() == 0 && departmentCombo.isEnabled()) {
			departmentCombo.setBackground(Colours.red);
			valid = false;
		} 
		try {
			Double.parseDouble(salaryField.getText());
			
			if (Double.parseDouble(salaryField.getText()) < 0) {
				salaryField.setBackground(Colours.red);
				valid = false;
			} 
		}
		catch (NumberFormatException num) {
			if (salaryField.isEditable()) {
				salaryField.setBackground(Colours.red);
				valid = false;
			} 
		}
		if (fullTimeCombo.getSelectedIndex() == 0 && fullTimeCombo.isEnabled()) {
			fullTimeCombo.setBackground(Colours.red);
			valid = false;
		} 
		if (!valid)
			JOptionPane.showMessageDialog(null, "Wrong values or format! Please check!");
	
		if (ppsField.isEditable())
			setToWhite();

		return valid;
	}


	private void setToWhite() {
		ppsField.setBackground(UIManager.getColor("TextField.background"));
		surnameField.setBackground(UIManager.getColor("TextField.background"));
		firstNameField.setBackground(UIManager.getColor("TextField.background"));
		salaryField.setBackground(UIManager.getColor("TextField.background"));
		genderCombo.setBackground(UIManager.getColor("TextField.background"));
		departmentCombo.setBackground(UIManager.getColor("TextField.background"));
		fullTimeCombo.setBackground(UIManager.getColor("TextField.background"));
	}
	
	
	
	
	public boolean correctPps(String pps, long currentByte) {
		boolean ppsExist = false;
	
		if (pps.length() == 7) {
			if (Character.isDigit(pps.charAt(0)) && Character.isDigit(pps.charAt(1))
					&& Character.isDigit(pps.charAt(2))	&& Character.isDigit(pps.charAt(3)) 
					&& Character.isDigit(pps.charAt(4))	&& Character.isDigit(pps.charAt(5)) 
					&& Character.isLetter(pps.charAt(6))
					&& (pps.length() == 7 || Character.isLetter(pps.charAt(6)))) {
				
				application.openReadFile(file.getAbsolutePath());
		
				ppsExist = application.isPpsExist(pps, currentByte);
				application.closeReadFile();
			}
			else
				ppsExist = true;
		}
		else
			ppsExist = true;

		return ppsExist;
	}

	
	
	
	
}*/
