package util;

import DTO.TotebagDTO;
import Entity.Totebag;

public class TotebagMapper implements Mapper<Totebag, TotebagDTO> {

    public Totebag convertToEntity(TotebagDTO totebagDTO) {
        return new Totebag(totebagDTO.getPrices(), totebagDTO.getTopic(), totebagDTO.getCreationDate(),
                totebagDTO.getDescription(), totebagDTO.getCapacityInLiters());
        }


    public TotebagDTO convertToDto(Totebag totebag) {
        return new TotebagDTO(totebag.getPrice(), totebag.getTopic(), totebag.getCreationDate(),
                totebag.getDescription(), totebag.getCapacityInLiters());
    }
    }


