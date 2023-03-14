package seedu.internship.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.internship.model.InternshipCatalogue;
import seedu.internship.model.internship.Internship;

/**
 * A utility class containing a list of {@code Internship} objects to be used in tests.
 */
public class TypicalInternships {
    // Values declared below should be moved to static seedu.address.logic.commands.CommandTestUtil package
    public static String VALID_POSITION_ML1 = "Machine Learning";
    public static String VALID_COMPANY_ML1 = "Tiktok";
    public static String VALID_ID_ML1 = "1";
    public static Integer VALID_STATUS_ML1 = 0;
    public static String VALID_DESCRIPTION_ML1 = "Registration Deadline: 20 Mar 2023";

    public static String VALID_POSITION_SE1 = "Software Engineer";
    public static String VALID_COMPANY_SE1 = "Grab";
    public static String VALID_ID_SE1 = "2";
    public static Integer VALID_STATUS_SE1 = 1;
    public static String VALID_DESCRIPTION_SE1 = "Interview Date: 20 May 2023";

    public static String VALID_POSITION_DA1 = "Data Analytics";
    public static String VALID_COMPANY_DA1 = "Google";
    public static String VALID_ID_DA1 = "3";
    public static Integer VALID_STATUS_DA1 = 2;
    public static String VALID_DESCRIPTION_DA1 = "Internship Period: 01 May 2023 to 31 July 2023";

    public static String VALID_POSITION_SD1 = "Software Developer";
    public static String VALID_COMPANY_SD1 = "Shopee";
    public static String VALID_ID_SD1 = "4";
    public static Integer VALID_STATUS_SD1 = 3;
    public static String VALID_DESCRIPTION_SD1 = "Rejected on 21 Feb 2023";

    public static String VALID_TAG_FUN = "fun";
    public static String VALID_TAG_IMPORTANT = "important";

    public static final Internship ML2 = new InternshipBuilder().withPosition("Machine Learning")
            .withCompany("GovTech").withId("5").withStatus(2).withDescription("Internship Period: unknown")
            .withTags("priority").build();
    public static final Internship SE3 = new InternshipBuilder().withPosition("Software Engineer")
            .withCompany("GovTech").withId("6").withStatus(3).withDescription("Rejected on 20 Feb 2023")
            .withTags("priority", "fun").build();
    public static final Internship SE4 = new InternshipBuilder().withPosition("Software Engineer")
            .withCompany("Apple").withId("7").withStatus(0).withDescription("Submitted resume").build();
    public static final Internship DS1 = new InternshipBuilder().withPosition("Data Science")
            .withCompany("Gojek").withId("8").withStatus(0).withDescription("Submitted resume").build();
    public static final Internship BE1 = new InternshipBuilder().withPosition("Backend Engineer")
            .withCompany("TikTok").withId("9").withStatus(0).withDescription("Submitted resume").build();
    public static final Internship ST1 =new InternshipBuilder().withPosition("Software Testing")
            .withCompany("Razor").withId("10").withStatus(1).withDescription("Interview Date: 20 Mar 2023")
            .withTags("priority", "important").build();
    public static final Internship DA2 = new InternshipBuilder().withPosition("Data Analyst")
            .withCompany("Infineon Technologies").withId("11").withStatus(2)
            .withDescription("Final interview unconfirmed").build();

    // Manually added - Internship's details found in {@code CommandTestUtil}
    public static final Internship ML1 = new InternshipBuilder().withPosition(VALID_POSITION_ML1)
            .withCompany(VALID_COMPANY_ML1).withId(VALID_ID_ML1).withDescription(VALID_DESCRIPTION_ML1)
            .withStatus(VALID_STATUS_ML1).withTags(VALID_TAG_IMPORTANT).build();
    public static final Internship SE1 = new InternshipBuilder().withPosition(VALID_POSITION_SE1)
            .withCompany(VALID_COMPANY_SE1).withId(VALID_ID_SE1).withDescription(VALID_DESCRIPTION_SE1)
            .withStatus(VALID_STATUS_SE1).withTags(VALID_TAG_IMPORTANT).withTags(VALID_TAG_FUN).build();
    public static final Internship DA1 = new InternshipBuilder().withPosition(VALID_POSITION_DA1)
            .withCompany(VALID_COMPANY_DA1).withId(VALID_ID_DA1).withDescription(VALID_DESCRIPTION_DA1)
            .withStatus(VALID_STATUS_DA1).build();
    public static final Internship SD1 = new InternshipBuilder().withPosition(VALID_POSITION_SD1)
            .withCompany(VALID_COMPANY_SD1).withId(VALID_ID_SD1).withDescription(VALID_DESCRIPTION_SD1)
            .withStatus(VALID_STATUS_SD1).build();

    public static final String KEYWORD_MATCHING_SOFTWARE = "software"; // A keyword that matches software

    private TypicalInternships() {} // prevents instantiation

    /**
     * Returns an {@code InternshipCatalogue} with all the typical internships.
     */
    public static InternshipCatalogue getTypicalInternshipCatalogue() {
        InternshipCatalogue ic = new InternshipCatalogue();
        for (Internship internship : getTypicalInternships()) {
            ic.addInternship(internship);
        }
        return ic;
    }

    public static List<Internship> getTypicalInternships() {
        return new ArrayList<>(Arrays.asList(ML2, SE3, SE4, DS1, BE1, ST1, DA2, ML1, SE1, DA1, SD1));
    }
}

