
public class ClassroomController {

    private final DeviceRegistry reg;

    public ClassroomController(DeviceRegistry reg) {
        this.reg = reg;
    }

    public void startClass() {
        // Projector needs power + input
        PowerControl pj = (PowerControl) reg.getFirstOfType("Projector");
        pj.powerOn();
        ((InputConnectable) pj).connectInput("HDMI-1");

        // Lights only needs brightness
        BrightnessControl lights = (BrightnessControl) reg.getFirstOfType("LightsPanel");
        lights.setBrightness(60);

        // AC only needs temperature
        TemperatureControl ac = (TemperatureControl) reg.getFirstOfType("AirConditioner");
        ac.setTemperatureC(24);

        // Scanner only needs scan
        AttendanceScan scan = (AttendanceScan) reg.getFirstOfType("AttendanceScanner");
        System.out.println("Attendance scanned: present=" + scan.scanAttendance());
    }

    public void endClass() {
        System.out.println("Shutdown sequence:");
        ((PowerControl) reg.getFirstOfType("Projector")).powerOff();
        ((PowerControl) reg.getFirstOfType("LightsPanel")).powerOff();
        ((PowerControl) reg.getFirstOfType("AirConditioner")).powerOff();
    }
}
