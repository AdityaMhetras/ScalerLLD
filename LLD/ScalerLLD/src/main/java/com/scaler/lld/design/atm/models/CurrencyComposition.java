package com.scaler.lld.design.atm.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.example.atm.constants.Constants.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyComposition {

    private NotesComposition notesComposition = new NotesComposition();
    private Double atmBalance  = 0.0;

    public NotesComposition getCustomerNotesComposition(Double withdrawAmount) {

        //updates existing notes composition and returns customer expected note composition
        NotesComposition customerNotesComposition = new NotesComposition();
        atmBalance -= withdrawAmount;

        if(withdrawAmount > 0 && notesComposition.getTwoThousandNotes() > 0) {
            int notesWithdrawn = (int) (withdrawAmount/twoThousand);
            if(notesComposition.getTwoThousandNotes() >= notesWithdrawn) {
                notesComposition.setTwoThousandNotes(notesComposition.getTwoThousandNotes() - notesWithdrawn);
                customerNotesComposition.setTwoThousandNotes(notesWithdrawn);
                withdrawAmount -= notesWithdrawn * twoThousand;
            }
        }

        if(withdrawAmount > 0 && notesComposition.getFiveHundredNotes() > 0) {
            int notesWithdrawn = (int) (withdrawAmount/fiveHundred);
            if(notesComposition.getFiveHundredNotes() >= notesWithdrawn) {
                notesComposition.setFiveHundredNotes(notesComposition.getFiveHundredNotes() - notesWithdrawn);
                customerNotesComposition.setFiveHundredNotes(notesWithdrawn);
                withdrawAmount -= notesWithdrawn * fiveHundred;
            }
        }

        if(withdrawAmount > 0 && notesComposition.getTwoHundredNotes() > 0) {
            int notesWithdrawn = (int) (withdrawAmount/twoHundred);
            if(notesComposition.getTwoHundredNotes() >= notesWithdrawn) {
                notesComposition.setTwoHundredNotes(notesComposition.getTwoHundredNotes() - notesWithdrawn);
                customerNotesComposition.setTwoHundredNotes(notesWithdrawn);
                withdrawAmount -= notesWithdrawn * twoHundred;
            }
        }

        if(withdrawAmount > 0 && notesComposition.getOneHundredNotes() > 0) {
            int notesWithdrawn = (int) (withdrawAmount/oneHundred);
            if(notesComposition.getOneHundredNotes() >= notesWithdrawn) {
                notesComposition.setOneHundredNotes(notesComposition.getOneHundredNotes() - notesWithdrawn);
                customerNotesComposition.setOneHundredNotes(notesWithdrawn);
                withdrawAmount -= notesWithdrawn * oneHundred;
            }
        }

        return customerNotesComposition;
    }

    public void seeComposition() {
        System.out.println("THE ATM COMPOSITION IS : ");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("2000 = " + notesComposition.getTwoThousandNotes());
        System.out.println("500 = " + notesComposition.getFiveHundredNotes());
        System.out.println("200 = " + notesComposition.getTwoHundredNotes());
        System.out.println("100 = " + notesComposition.getOneHundredNotes());

        System.out.println("--------------------------------------------------------------------------------");

    }
}
