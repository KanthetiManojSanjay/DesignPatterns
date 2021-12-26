package adapter;

/**
 * @author kansanja on 18/12/21.
 */
public class IndianPowerAdapater implements USSocketInterface {
    private IndianSocketInterface indianSocketInterface;

    public IndianPowerAdapater(IndianSocketInterface indianSocketInterface) {
        this.indianSocketInterface = indianSocketInterface;
    }

    @Override
    public void powerUp() {
        this.indianSocketInterface.provideElectricity();
    }
}
