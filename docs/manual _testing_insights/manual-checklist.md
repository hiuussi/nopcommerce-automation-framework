# 📝 Manual Testing Checklist  
A practical checklist to ensure coverage of essential manual QA activities.

---

## 1. Functional Testing Checklist
- [ ] All UI elements display correctly  
- [ ] Input fields validate correctly (max length, format, required fields)  
- [ ] Buttons perform correct actions  
- [ ] Error messages appear when needed  
- [ ] Test positive flows  
- [ ] Test negative flows  
- [ ] Validate mandatory/optional fields  
- [ ] Validate boundary values  
- [ ] Validate drop-down and selection components  
- [ ] Test multi-step forms  

---

## 2. UI/UX Checklist
- [ ] Layout and alignment are consistent  
- [ ] Font sizes and colors follow design  
- [ ] Spacing and padding are consistent  
- [ ] Hover states work correctly  
- [ ] Mobile responsive layout behaves correctly  
- [ ] Images load and scale properly  

---

## 3. Cross-Browser Checklist
Test in at least:
- [ ] Chrome  
- [ ] Firefox  
- [ ] Edge  
- [ ] Safari (if applicable)  

Check:
- [ ] Page rendering  
- [ ] CSS issues  
- [ ] JavaScript behavior  

---

## 4. Usability Checklist
- [ ] Navigation is intuitive  
- [ ] Buttons & CTAs are easily discoverable  
- [ ] Forms prevent user mistakes  
- [ ] Important actions have confirmation dialogs  
- [ ] User can recover from errors  

---

## 5. Accessibility Checklist
- [ ] Keyboard navigation works  
- [ ] Alt text on images  
- [ ] Color contrast meets WCAG standards  
- [ ] ARIA labels where necessary  
- [ ] Screen reader basic support  

---

## 6. API Checklist
- [ ] Status codes correct (200, 400, 401, 500...)  
- [ ] Response time is stable  
- [ ] JSON schema is correct  
- [ ] Error messages are descriptive  
- [ ] Invalid inputs return expected errors  

---

## 7. Security Checklist
- [ ] Password masked correctly  
- [ ] No sensitive info in logs  
- [ ] Unauthorized users blocked  
- [ ] Protected endpoints require authentication  
- [ ] Basic SQL injection tests  
- [ ] Basic XSS tests  

---

## 8. Data Validation Checklist
- [ ] Data saved correctly to DB  
- [ ] Data persists after refresh  
- [ ] Data displayed belongs to logged-in user  
- [ ] Sorting & filtering work correctly  

---

## 9. Mobile Testing Checklist (if applicable)
- [ ] Responsive layout  
- [ ] Touch gestures work  
- [ ] Page scroll behavior correct  
- [ ] Layout adjusts for orientation changes  

---

## 10. Regression Checklist
- [ ] Old features unaffected by changes  
- [ ] Check critical flows:  
  - Login  
  - Search  
  - Checkout  
  - Payment  
  - User profile  
- [ ] Retest fixed bugs  

---

## 11. Pre-Release Checklist
- [ ] Smoke tests passed  
- [ ] No critical/blocker defects  
- [ ] API and UI stable  
- [ ] Documentation updated  
- [ ] Test results archived  

---

## Final Notes
This checklist should be updated continuously as the project evolves.  
Use it as a foundation to ensure consistent and thorough manual testing.
