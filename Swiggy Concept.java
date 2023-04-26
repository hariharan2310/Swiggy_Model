import java.util.Scanner;

public class Swiggy {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\"Welcome to Swiggy\"");
		System.out.println("Please select the Hotel");
		System.out.println("1.Buhari \n2.S S Hydrabad\n3.A2B\n4.Junior Kuppanna");
		int hotel = sc.nextInt();
		switch(hotel)
		{
		case 1:{
			System.out.println("Buhari Welcomes You");
			System.out.println("Please select the dish");
			System.out.println("1.Chicken Briyan\n2.Mutton Briyani\n3.Chicken Boneless\n4.Chicken Lolipop");
			int dish=sc.nextInt();
			switch(dish)
			{
			case 1:{
				//Chicken Briyani
				int briyani_amt = 199;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Chicken Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
														
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 2:{
				//Mutton Briyani
				int briyani_amt = 349;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Motton Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				}
				break;
			}
			case 3:
			{
				//Chicken Boneless
				int briyani_amt = 129;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Chicken Boneless");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 4:{
				//Chicken Lolipop
			int briyani_amt = 139;
			System.out.print("Enter the quantity You Want: ");
			int qty=sc.nextInt();
			int total_amt=briyani_amt*qty;
			Thread.sleep(1500);
			System.out.println("Your Order is "+qty+" Chicken Lolipop");
			System.out.println("Your Bill Amount is: "+total_amt);
			System.out.println("Please Select the Payment Option");
			System.out.println("1.Google Pay\n2.PhonePe");
			int pmt_opt= sc.nextInt();
			switch(pmt_opt)
			{
			case 1:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			case 2:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			}
			break;
			}
			}
			break;
		}
		case 2:
		{

			System.out.println("SS Hydrabad Welcomes You");
			System.out.println("Please select the dish");
			System.out.println("1.Chicken Briyan\n2.Mutton Briyani\n3.Empty Briyani\n4.Grill Chicken (Full)");
			int dish=sc.nextInt();
			switch(dish)
			{
			case 1:{
				//Chicken Briyani
				int briyani_amt = 240;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Chicken Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 2:{
				//Mutton Briyani
				int briyani_amt = 350;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Mutton Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 3:
			{
				//Empty Briyani
				int briyani_amt = 90;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Empty Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 4:{
				//Grill
			int briyani_amt = 400;
			System.out.print("Enter the quantity You Want: ");
			int qty=sc.nextInt();
			int total_amt=briyani_amt*qty;
			Thread.sleep(1500);
			System.out.println("Your Order is "+qty+" Grilled Chicken");
			System.out.println("Your Bill Amount is: "+total_amt);
			System.out.println("Please Select the Payment Option");
			System.out.println("1.Google Pay\n2.PhonePe");
			int pmt_opt= sc.nextInt();
			switch(pmt_opt)
			{
			case 1:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			case 2:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			}
			break;
			}
			}
			break;
		}
		case 3:
		{

			System.out.println("A2B Welcomes You");
			System.out.println("Please select the dish");
			System.out.println("1.Full Meal\n2.Half Meal\n3.Onion Roast\n4.Rava Roast");
			int dish=sc.nextInt();
			switch(dish)
			{
			case 1:{
				//Full Meal
				int briyani_amt = 130;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Full Meal");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				}
				break;
			}
			case 2:{
				//Half Meal
				int briyani_amt = 90;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Half Meal");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 3:
			{
				//Onion Roast
				int briyani_amt = 110;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Onion Roast");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}
					break;
				}
				}
				break;
			}
			case 4:{
				//Rava Roast
			int briyani_amt = 110;
			System.out.print("Enter the quantity You Want: ");
			int qty=sc.nextInt();
			int total_amt=briyani_amt*qty;
			Thread.sleep(1500);
			System.out.println("Your Order is "+qty+" Rava Roast");
			System.out.println("Your Bill Amount is: "+total_amt);
			System.out.println("Please Select the Payment Option");
			System.out.println("1.Google Pay\n2.PhonePe");
			int pmt_opt= sc.nextInt();
			switch(pmt_opt)
			{
			case 1:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			case 2:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			}
			break;
			}
			}
			break;
		}
		case 4:
		{

			System.out.println("Junior Kuppana Welcomes You");
			System.out.println("Please select the dish");
			System.out.println("1.Non-Veg Meal\n2.Chicken Briyani\n3.Thanjavur Special Gravy\n4.Motton Chukka");
			int dish=sc.nextInt();
			switch(dish)
			{
			case 1:{
				//Non-Veg Meal
				int briyani_amt = 300;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Non-Veg Meal");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 2:{
				//Chicken Briyani
				int briyani_amt = 249;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Chicken Briyani");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 3:
			{
				//Thanjavur Special Gravy
				int briyani_amt = 349;
				System.out.print("Enter the quantity You Want: ");
				int qty=sc.nextInt();
				int total_amt=briyani_amt*qty;
				Thread.sleep(1500);
				System.out.println("Your Order is "+qty+" Thanjavur Special Gravy");
				System.out.println("Your Bill Amount is: "+total_amt);
				System.out.println("Please Select the Payment Option");
				System.out.println("1.Google Pay\n2.PhonePe");
				int pmt_opt= sc.nextInt();
				switch(pmt_opt)
				{
				case 1:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				case 2:{
					System.out.print("Enter the amount: ");
					double amt=sc.nextInt();
					if (total_amt==amt)
					{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
						System.out.println("Please Enter the otp");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
						{
							Thread.sleep(1500);
							System.out.println("Payment Successfull\nWait for Confirmation");
							Thread.sleep(1500);
							System.out.println("Order Confirmed");
							Thread.sleep(1500);
							System.out.println("Thank You\nYour order will Recieve in 30 Min");
							
						}
						else
						{
							System.out.println("Payment Failed");
						}
					}
					else
					{
						System.out.println("Payment Failed");
					}break;
				}
				}
				break;
			}
			case 4:{
				//Mutton Chukka
			int briyani_amt = 299;
			System.out.print("Enter the quantity You Want: ");
			int qty=sc.nextInt();
			int total_amt=briyani_amt*qty;
			Thread.sleep(1500);
			System.out.println("Your Order is "+qty+" Mutton Chukka");
			System.out.println("Your Bill Amount is: "+total_amt);
			System.out.println("Please Select the Payment Option");
			System.out.println("1.Google Pay\n2.PhonePe");
			int pmt_opt= sc.nextInt();
			switch(pmt_opt)
			{
			case 1:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			case 2:{
				System.out.print("Enter the amount: ");
				double amt=sc.nextInt();
				if (total_amt==amt)
				{
					double sys_otp=Math.random()*9999+9999;
					int Otp=(int)sys_otp;
					Thread.sleep(1500);
					System.out.println("Your Otp For the amount "+total_amt+" is: "+Otp);
					System.out.println("Please Enter the otp");
					int otp_in=sc.nextInt();
					if(otp_in==Otp)
					{
						Thread.sleep(1500);
						System.out.println("Payment Successfull\nWait for Confirmation");
						Thread.sleep(1500);
						System.out.println("Order Confirmed");
						Thread.sleep(1500);
						System.out.println("Thank You\nYour order will Recieve in 30 Min");
						
					}
					else
					{
						System.out.println("Payment Failed");
					}
				}
				else
				{
					System.out.println("Payment Failed");
				}break;
			}
			}
			break;
			}
			}
			break;
		}
		}
	}

}
