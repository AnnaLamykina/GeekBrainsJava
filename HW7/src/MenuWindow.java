import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuWindow extends JFrame {

    private int widthWindow = 800;
    private int heightWindow = 650;
    private int windowX;
    private int windowY;
    private final int minScale = 100;
    private final int maxScale = 600;
    private final int currentScale = 100;

    private JPanel panelSettings;
    private JPanel panelControls;
    private JButton buttonStart;
    private JButton buttonExit;
    private JButton buttonClearLog;

    private JTextArea log;
    private JScrollPane scrollPanel;
    private JLabel labelMapSize;
    public JSlider sliderWidth;
    private JSlider sliderHeight;
    private JLabel labelWinLength;

    private String width = "Width: ";
    private String height = "Height: ";
    private GameMap imageField;
    private Picture pic;

    public MenuWindow() {
        gameSettings();
        buttons();
        controlsSettings();
        LogSettings();

        imageField = new GameMap();
        pic = new Picture();
        panelSettings.add(panelControls, BorderLayout.NORTH);
        panelSettings.add(scrollPanel, BorderLayout.SOUTH);
        add(panelSettings, BorderLayout.WEST);
        add(imageField);
        imageField.add(pic, new GridBagConstraints());

        setVisible(true);
        windowSettings();
    }

    private void gameSettings() {
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2, 1));
    }

    private void controlsSettings() {
        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(10, 1));
        labelMapSize = new JLabel(height + minScale);
        sliderWidth = new JSlider(minScale, maxScale, minScale);

        sliderWidth.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelMapSize.setText(height + sliderWidth.getValue());
                pic.ReScale(sliderWidth.getValue(), sliderHeight.getValue());
                collectAllGameSetupFromUser();
            }
        });

        labelWinLength = new JLabel(width + currentScale);
        sliderHeight = new JSlider(minScale, maxScale, minScale);
        sliderHeight.addChangeListener((new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(width + sliderHeight.getValue());
                pic.ReScale(sliderWidth.getValue(), sliderHeight.getValue());
                collectAllGameSetupFromUser();
            }
        }));

        panelControls.add(labelMapSize);
        panelControls.add(sliderWidth);
        panelControls.add(labelWinLength);
        panelControls.add(sliderHeight);
        panelControls.add(buttonStart);
        panelControls.add(buttonClearLog);
        panelControls.add(buttonExit);

    }

    private void windowSettings() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        windowX = ((screenSize.width - widthWindow) / 2);
        windowY = ((screenSize.height - heightWindow) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthWindow, heightWindow);
        setLocation(windowX, windowY);
        setTitle("First Window");
        setResizable(false);
    }

    private void buttons() {
        buttonStart = new JButton("Set visibility");
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pic.SetVisible();
                collectAllGameSetupFromUser();
            }
        });
        buttonClearLog = new JButton("Clear log");
        buttonClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.setText("");
            }
        });
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    private void LogSettings() {
        log = new JTextArea();
        scrollPanel = new JScrollPane(log);
        log.setEditable(false);
        log.setLineWrap(true);
    }

    void recordLog(String text) {
        log.append(text + "\n");
    }

    private void collectAllGameSetupFromUser() {
        int width = sliderWidth.getValue();
        int height = sliderHeight.getValue();
        recordLog("-------------");
        recordLog("User choose width: " + width);
        recordLog("User choose height: " + height);
    }

}
