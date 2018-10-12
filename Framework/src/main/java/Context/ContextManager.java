/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import Helpers.XMLHelper;

/**
 *
 * @author Franco.Garcia
 */
public class ContextManager {
    public static void putObject() {
        XMLHelper.preObjects.add(new PreObjects(XMLHelper.object));
    }
}
