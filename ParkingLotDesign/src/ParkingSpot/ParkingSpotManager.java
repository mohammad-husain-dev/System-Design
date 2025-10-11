package ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSpotManager {
    Map<ParkingSpotType, List<ParkingSpot>> parkingSpots;
    private static ParkingSpotManager psm=null;

    private ParkingSpotManager() {
        parkingSpots = new HashMap<ParkingSpotType, List<ParkingSpot>>();
    }

    public static ParkingSpotManager getParkingLotInstance(){
        if(psm==null)
            psm=new ParkingSpotManager();
        return psm;
    }

    ///  add a new parkingSpot
    public void addParkingSpot(ParkingSpot ps){
        ParkingSpotType pst=ps.type;
        if(parkingSpots.containsKey(pst)){
            parkingSpots.get(pst).add(ps);
        }else{
            List<ParkingSpot> list=new ArrayList<ParkingSpot>();
            list.add(ps);
            parkingSpots.put(pst,list);
        }
    }

    ///  remove a parkingSpot
    public void removeParkingSpot(ParkingSpot ps){
        ParkingSpotType pst=ps.type;
        List<ParkingSpot> list=parkingSpots.get(pst);
        if(list!=null){
            list.remove(ps);
        }
    }

    ///  find a parkingSpot
    ParkingSpot findAvailableParkingSpot(){
        ParkingSpot pst=null;

        return pst;
    }

}
