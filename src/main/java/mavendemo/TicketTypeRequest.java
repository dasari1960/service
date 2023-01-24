package mavendemo;

public final class TicketTypeRequest {
    private final int accountId;
    private final int infantCount;
    private final int childCount;
    private final int adultCount;

    public TicketTypeRequest(int accountId, int infantCount, int childCount, int adultCount) {
        this.accountId = accountId;
        this.infantCount = infantCount;
        this.childCount = childCount;
        this.adultCount = adultCount;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getInfantCount() {
        return infantCount;
    }

    public int getChildCount() {
        return childCount; 
}
public int getAdultCount() {
    return adultCount;
}

public int getTotalCount() {
    return infantCount + childCount + adultCount;
}
}
