package api.parking.services;

import api.parking.entity.Mensalist;

public class PromoteMensalistService {

    public void promoteMensalist(Mensalist mensalist) {
        mensalist.setTier(mensalist.getTier());
    }
}
