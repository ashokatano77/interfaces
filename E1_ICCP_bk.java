import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E1_ICCP_bk {
    private JFrame frame;
    private JTextField nombreContactoField, telefonoContactoField, numeroPersonasField, comensalesPorMesaField;
    private JSpinner fechaEventoSpinner, numeroJornadasSpinner;
    private JComboBox<String> tipoEventoCombo, tipoCocinaCombo;
    private JCheckBox requiereHabitacionesCheckBox;
    private JRadioButton mesaRectangularRadio, mesaRedondaRadio;

    public E1_ICCP_bk() {
        frame = new JFrame("Reserva de Salón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear y configurar componentes
        nombreContactoField = new JTextField(20);
        telefonoContactoField = new JTextField(20);
        fechaEventoSpinner = new JSpinner();
        tipoEventoCombo = new JComboBox<>(new String[]{"Banquete", "Jornada", "Congreso"});
        numeroPersonasField = new JTextField(10);
        tipoCocinaCombo = new JComboBox<>(new String[]{"Buffet", "Carta", "Cita con el chef", "No precisa"});
        requiereHabitacionesCheckBox = new JCheckBox("¿Requiere habitaciones?");
        numeroJornadasSpinner = new JSpinner();
        mesaRectangularRadio = new JRadioButton("Mesa Rectangular");
        mesaRedondaRadio = new JRadioButton("Mesa Redonda");
        comensalesPorMesaField = new JTextField(10);

        // Configurar el botón de guardar
        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Manejar la acción de guardar aquí
                // Puedes obtener los valores de los componentes como nombreContactoField.getText()
                // y realizar la lógica necesaria para guardar la reserva.
            }
        });

        // Crear y configurar paneles
        JPanel panelDatosContacto = new JPanel(new GridLayout(3, 2));
        panelDatosContacto.add(new JLabel("Nombre de Contacto:"));
        panelDatosContacto.add(nombreContactoField);
        panelDatosContacto.add(new JLabel("Teléfono de Contacto:"));
        panelDatosContacto.add(telefonoContactoField);

        JPanel panelTipoEvento = new JPanel(new FlowLayout());
        panelTipoEvento.add(new JLabel("Tipo de Evento:"));
        panelTipoEvento.add(tipoEventoCombo);

        // Configurar la visibilidad de componentes según el tipo de evento seleccionado
        tipoEventoCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedTipo = (String) tipoEventoCombo.getSelectedItem();
                // Implementa la lógica para habilitar/deshabilitar componentes según el tipo de evento
            }
        });

        // Crear y configurar el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.add(panelDatosContacto);
        panelPrincipal.add(panelTipoEvento);
        // Agregar más paneles y componentes según tus necesidades
        panelPrincipal.add(requiereHabitacionesCheckBox);
        panelPrincipal.add(numeroJornadasSpinner);
        panelPrincipal.add(mesaRectangularRadio);
        panelPrincipal.add(mesaRedondaRadio);
        panelPrincipal.add(comensalesPorMesaField);
        panelPrincipal.add(guardarButton);

        // Agregar el panel principal a la ventana
        frame.add(panelPrincipal);

        // Configurar la ventana
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new E1_ICCP_bk();
            }
        });
    }
}
