public class cigarParty {
  public boolean cigarParty(int cigars, boolean isWeekend) {
    return ((cigars > 39 && cigars < 61 && isWeekend == false)
        || (cigars > 39 && isWeekend == true));
  }
}
