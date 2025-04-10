package in.java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllMatchingPattern {
	public static void main(String[] args) {
		
		//---------------------------------------------------------------------
		List<String> accountNumbers = Arrays.asList("1238472495", "4262585296", "9952261656", "6379853850", "5363636904");
		String last4 = "6904";
		System.out.println("FIltered by last4digit := " + filterAccnum(accountNumbers, last4));
		
		//-------------------------------------------------------------------------
		List<String> emails = Arrays.asList("user1@example.com", "user2@test.com", "user3@example.com");
		String domain = "example.com";
		System.out.println("Filter By domains" + matchEmails(emails, domain));
		
		//---------------------------------------------------------------------------
		List<String> words = Arrays.asList("running", "jumping", "playing", "sleeping", "walk");
		String suffix = "ing";
		System.out.println("Filter By suffix" + matchsuffix(words, suffix));
		
		//----------------------------------------------------------------------------
		List<String> phoneNumbers = Arrays.asList("+911234567890", "+919876543210", "+12123456789");
	    System.out.println("Filtered Phone Numbers: " + filterPhoneNumbersByCountryCode(phoneNumbers, "+91"));
	    
	    //-----------------------------------------------------------------------------    
	    List<String> files = Arrays.asList("document.txt", "image.jpg", "notes.txt", "presentation.pptx");
	    System.out.println("Filtered Files: " + filterFilesByExtension(files, ".txt"));
	   
	    //----------------------------------------------------------------------------------    
	    List<String> urls = Arrays.asList("https://example.com", "http://test.com", "https://secure.com");
	    System.out.println("Filtered URLs: " + filterUrlsByProtocol(urls, "https://"));
	}
	
	// filter Account number by matching last 4 digits.
	public static List<String> filterAccnum(List<String> acc, String digit){
		return acc.stream().
				filter(accnum -> accnum.endsWith(digit)).collect(Collectors.toList());
	}
	
	
	//  Filter Email Addresses by Domain
	public static List<String> matchEmails(List<String> emails , String domain) {
		return emails.stream().
			filter(e -> e.endsWith(domain)).collect(Collectors.toList());
	}
	
	// Identify Strings Ending with a Specific Suffix
	public static List<String > matchsuffix(List<String> words, String suffix){
		return words.stream().
				filter(w -> w.endsWith(suffix)).collect(Collectors.toList());
	}
	
	 // Validate Phone Numbers by Country Code
    public static List<String> filterPhoneNumbersByCountryCode(List<String> phoneNumbers, String countryCode) {
        return phoneNumbers.stream()
                           .filter(number -> number.startsWith(countryCode))
                           .collect(Collectors.toList());
    }
    
    // Filter File Names by Extension
    public static List<String> filterFilesByExtension(List<String> files, String extension) {
        return files.stream()
                    .filter(file -> file.endsWith(extension))
                    .collect(Collectors.toList());
    }
    
    // Extract URLs with Specific Protocols
    public static List<String> filterUrlsByProtocol(List<String> urls, String protocol) {
        return urls.stream()
                   .filter(url -> url.startsWith(protocol))
                   .collect(Collectors.toList());
    }
	
}
