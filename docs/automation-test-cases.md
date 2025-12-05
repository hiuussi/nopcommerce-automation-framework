# 🧪 Automation Test Cases – NopCommerce Demo Store

Below is a list of core test cases selected for automation.  
Each test case is designed for UI automation using Selenium + TestNG.

---

## 🔐 1. User Registration

### **TC001 – Register with valid information**
| Field | Details |
|-------|---------|
| Objective | Verify that a user can register successfully |
| Pre-condition | User is on the registration page |
| Steps | 1. Open registration page<br>2. Enter valid details<br>3. Submit form |
| Expected Result | Registration successful confirmation message |

---

### **TC002 – Registration with existing email**
| Objective | Verify error when registering with an already-used email |
| Expected Result | Appropriate validation error is displayed |

---

## 🔑 2. User Login

### **TC003 – Login with valid credentials**
| Objective | Verify successful login |
| Steps | Enter valid email + password |
| Expected Result | User is redirected to My Account |

---

### **TC004 – Login with invalid password**
| Objective | Verify error handling |
| Expected Result | Correct error message displayed |

---

## 🔍 3. Product Search

### **TC005 – Search product by name**
| Objective | Validate search returns correct results |
| Steps | Search “Laptop” |
| Expected Result | Only laptop-related items appear |

---

## 🛒 4. Add to Cart

### **TC006 – Add product to cart from product detail page**
| Objective | Confirm users can add products to cart |
| Expected Result | Cart item count increases |

---

## 💙 5. Wishlist

### **TC007 – Add product to wishlist**
| Objective | Ensure wishlist feature works properly |
| Expected Result | Product appears in wishlist page |

---

## 📦 6. Checkout Flow

### **TC008 – Guest checkout**
| Objective | Verify user can complete checkout as guest |
| Expected Result | Order completed successfully |

---

### **TC009 – Checkout with registered user**
| Objective | Verify checkout using logged-in account |
| Expected Result | Order placed successfully |

---

## 🏷 UI & Validation

### **TC010 – Required field validation (Registration)**
| Objective | Verify validation messages appear correctly |
| Expected Result | Inline validation message displayed |

---

## 🧹 Negative & Boundary Cases

### **TC011 – Invalid search keyword**
| Objective | Verify no-results page is handled correctly |

### **TC012 – Add out-of-stock item**
| Objective | Ensure system handles unavailable products correctly |

---

## 📌 Note
- All test cases are mapped to POM page classes  
- Test data is stored in `/src/main/resources/testdata/`  
- Each test is atomic and independent  

