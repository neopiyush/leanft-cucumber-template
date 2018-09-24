<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AppModel</className>
    <objects>
        <object type="Page" technology="Web">
            <name>Welcome: Mercury Tours</name>
            <codeName>WelcomeMercuryToursPage</codeName>
            <identification/>
            <children>
                <object type="EditField" technology="Web">
                    <name>userName</name>
                    <codeName>UserNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">userName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>password</name>
                    <codeName>PasswordEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">password</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                </object>
                <object type="Image" technology="Web">
                    <name>Sign-In</name>
                    <codeName>SignInImage</codeName>
                    <identification>
                        <properties>
                            <property name="Alt" type="string" isRegExp="false">Sign-In</property>
                            <property name="Type" type="enum" isRegExp="false">Button</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                        </properties>
                    </identification>
                </object>
                <object type="Link" technology="Web">
                    <name>REGISTER</name>
                    <codeName>REGISTERLink</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">A</property>
                            <property name="InnerText" type="string" isRegExp="false">REGISTER</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
        <object type="Page" technology="Web">
            <name>Register: Mercury Tours</name>
            <codeName>RegisterMercuryToursPage</codeName>
            <identification/>
            <children>
                <object type="Link" technology="Web">
                    <name>REGISTER</name>
                    <codeName>REGISTERLink</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">A</property>
                            <property name="InnerText" type="string" isRegExp="false">REGISTER</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>firstName</name>
                    <codeName>FirstNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">firstName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>lastName</name>
                    <codeName>LastNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">lastName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>phone</name>
                    <codeName>PhoneEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">phone</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>userName</name>
                    <codeName>UserNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">userName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>address1</name>
                    <codeName>Address1EditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">address1</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>city</name>
                    <codeName>CityEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">city</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>state</name>
                    <codeName>StateEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">state</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>postalCode</name>
                    <codeName>PostalCodeEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">postalCode</property>
                        </properties>
                    </identification>
                </object>
                <object type="ListBox" technology="Web">
                    <name>country</name>
                    <codeName>CountryListBox</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">SELECT</property>
                            <property name="Name" type="string" isRegExp="false">country</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>email</name>
                    <codeName>EmailEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">email</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>password</name>
                    <codeName>PasswordEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">password</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>confirmPassword</name>
                    <codeName>ConfirmPasswordEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">password</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">confirmPassword</property>
                        </properties>
                    </identification>
                </object>
                <object type="Image" technology="Web">
                    <name>register</name>
                    <codeName>RegisterImage</codeName>
                    <identification>
                        <properties>
                            <property name="Alt" type="string" isRegExp="false"/>
                            <property name="Type" type="enum" isRegExp="false">Button</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Generated UserName</name>
                    <codeName>UserNameWebElement</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">B</property>
                            <property name="InnerText" type="string" isRegExp="true">Note: Your user name is.*</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
