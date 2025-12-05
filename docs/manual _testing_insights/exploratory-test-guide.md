# 🔍 Exploratory Testing Guide

A practical guide for testers to perform structured and effective exploratory testing.

---

## 1. Introduction
Exploratory testing is simultaneous **learning**, **designing tests**, and **executing tests**.  
It helps uncover unexpected issues and evaluate system behavior from a user's perspective.

---

## 2. Objectives
- Identify defects that scripted tests may miss  
- Explore edge cases and unusual workflows  
- Validate usability and user experience  
- Gain insights into system weaknesses

---

## 3. Exploratory Testing Approach

### 3.1 Session-Based Testing
Each session includes:
- **Charter** (objective of the session)
- **Timebox** (typically 30–90 minutes)
- **Notes and observations**
- **Bugs discovered**
- **Follow-up items**

---

## 4. How to Perform Exploratory Testing

### Step 1 — Define the Charter
Example charters:
- Explore the cart functionality with different product types.
- Evaluate checkout behavior with invalid payment data.
- Stress test search feature using boundary values.

---

### Step 2 — Identify Heuristics & Ideas
Common heuristics:
- **CRUD** (Create, Read, Update, Delete)
- **Error guessing**
- **Boundary testing**
- **User roles and permissions**
- **Interrupt testing** (refresh, back button, network loss)

---

### Step 3 — Execute & Take Notes
Record:
- Steps taken
- Observed behavior
- Bugs found
- System responses

Keep notes short, fast, and useful.

---

### Step 4 — Report Findings
Provide:
- Bug reports  
- Improvement suggestions  
- Risks discovered  
- Out-of-scope issues  

---

## 5. Tools (Optional)
- Screenshot tools (Lightshot, Snipping Tool)
- Session timers
- Mind maps
- Browser developer tools
- API clients (Postman)

---

## 6. Best Practices
- Keep charters focused  
- Test like a real end-user  
- Use different data sets  
- Combine actions unexpectedly  
- Explore beyond the “happy path”  

---

## 7. Example Exploratory Charter

**Charter:** Explore product search with different query types  
**Timebox:** 45 minutes  
**Focus Areas:**  
- Empty search  
- Long string input  
- Special characters  
- Rapid repeated searches  

**Notes:**  
- Search returns inconsistent results when using “@” in query  
- UI freezes after 10 rapid searches  

**Bugs reported:** 2  
