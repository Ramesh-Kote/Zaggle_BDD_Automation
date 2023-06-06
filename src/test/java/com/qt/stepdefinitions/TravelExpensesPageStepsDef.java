package com.qt.stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.qt.bdd.pages.TravelExpensesPage;
import com.qt.bdd.utils.TestContext;

import io.cucumber.java.en.When;

public class TravelExpensesPageStepsDef {
	TestContext testContext;
	TravelExpensesPage travelExpensesPage;

	public TravelExpensesPageStepsDef(TestContext context) {
		testContext = context;
		travelExpensesPage = testContext.getPageObjectManager().getTravelExpensesPage();
	}

	@When("I clicked on the TravelExpenses tab")
	public void i_clicked_on_the_TravelExpenses_tab() {
		travelExpensesPage.clickOnTravalExpence();
	}


	@When("I navigate to tripId {string}")
	public void i_navigate_to_tripId(String tripId) {
		travelExpensesPage.navigateTotripId(tripId);
	}

	
	@When("I verify travel expenses tripId details {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}") 
	public void i_verify_travel_expenses_tripIdHeader(String tripId,String
			traveller ,String reasonforTravel,String tripStartDate,String tripEndDate,
			String supplierName,String ProductType,String ItineraryType,String
			productName,String description,String airlinePNR,String ticketNumber,String cabinClass,String
			grossFare,String journeyType ,String departureDate,String arrivalDate,String
			originCountry,String destinationCountry) {
		Map<String,String> tot_value =travelExpensesPage.verifyTripIdDetails();
		Assert.assertEquals(tot_value.get("Trip ID"), tripId);
		Assert.assertEquals(tot_value.get("Traveller"), traveller);
		Assert.assertEquals(tot_value.get("Reason for Travel"), reasonforTravel);
		Assert.assertEquals(tot_value.get("Trip Start Date"), tripStartDate);
		Assert.assertEquals(tot_value.get("Trip End Date"), tripEndDate);
		Assert.assertEquals(tot_value.get("Supplier Name"), supplierName);
		Assert.assertEquals(tot_value.get("Product Type"), ProductType);
		Assert.assertEquals(tot_value.get("Itinerary Type"), ItineraryType);
		Assert.assertEquals(tot_value.get("Product Name"), productName);
		Assert.assertEquals(tot_value.get("Description"), description);
		Assert.assertEquals(tot_value.get("Airline PNR"), airlinePNR);		
		Assert.assertEquals(tot_value.get("Ticket Number"), ticketNumber);		
		Assert.assertEquals(tot_value.get("Cabin Class"), cabinClass);
		Assert.assertEquals(tot_value.get("Gross Fare"), grossFare);
		Assert.assertEquals(tot_value.get("Journey Type"), journeyType);
		Assert.assertEquals(tot_value.get("Departure Date"), departureDate);
		Assert.assertEquals(tot_value.get("Arrival Date"), arrivalDate);
		Assert.assertEquals(tot_value.get("Origin Country"), originCountry);
		Assert.assertEquals(tot_value.get("Destination Country"), destinationCountry);
		
	}

	@When("I clicked on the AddTripReport button")
	public void i_clicked_on_the_AddTripReport_button() throws Exception {
		travelExpensesPage.clickOnAddTripReport();
	}
}
